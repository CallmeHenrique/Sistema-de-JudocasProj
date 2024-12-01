package org.fpij.jitakyoei;

import org.fpij.jitakyoei.facade.AppFacadeImpl;
import org.fpij.jitakyoei.view.AppView;
import org.fpij.jitakyoei.view.MainAppView;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.model.dao.DAO;
import org.fpij.jitakyoei.model.dao.DAOImpl;
import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Date;
import java.util.List;

public class AdicionarEntidadeTest {

    private static AppView fakeview;
    private static AppFacadeImpl facadeimp;
    private static DAO<Entidade> entidadeDao;

    @BeforeClass
    public static void setUpEnvironment(){
        // Criar as telas
        fakeview = new MainAppView();
        facadeimp = new AppFacadeImpl(fakeview);
        clearDB();
    }

    public static void clearDB(){
        // Limpar o Banco de Dados
        entidadeDao = new DAOImpl<Entidade>(Entidade.class);
        List<Entidade> lista = entidadeDao.list();
        for(Entidade ent : lista){
            entidadeDao.delete(ent);
        }
    }

    @Test
    public void CadastrarEntidadeDadosValidos(){
        clearDB();
        Endereco end = new Endereco();
        end.setBairro("Bairro dos Amigos");
        end.setCep("12345.123");
        end.setCidade("Cidades dos Amigos");
        end.setEstado("SP");
        end.setNumero("123");
        end.setRua("Rua 7");

        Entidade entity = new Entidade();
        entity.setEndereco(end);
        // Gerado com https://www.4devs.com.br/gerador_de_cnpj
        entity.setCnpj("98.558.441/0001-08");
        entity.setNome("Entidade Do Joao");
        entity.setTelefone1("(84) 2254-6791");
        entity.setTelefone2("(92) 3534-2616");
        facadeimp.createEntidade(entity);

        assertEquals(1, facadeimp.searchEntidade(entity).size());
    }

    @Test
    public void CadastrarEntidadeDadosInvalidos(){
        clearDB();
        Endereco end = new Endereco();
        end.setBairro("Bairro dos Amigos");
        end.setCep("ABCDE.123");
        end.setCidade("Cidades dos Amigos");
        end.setEstado("12");
        end.setNumero("ABC");
        end.setRua("Rua 7");

        Entidade entity = new Entidade();
        entity.setEndereco(end);
        // Gerado com https://www.4devs.com.br/gerador_de_cnpj
        entity.setCnpj("98.ABC.441/0001-08");
        entity.setNome("Entidade Do");
        entity.setTelefone1("(//) 2254-6A91");
        entity.setTelefone2("(//) ABCD-2616");

        facadeimp.createEntidade(entity);   

        //assertEquals(1, facadeimp.searchEntidade(entity).size());
    }

    @Test
    public void CadastrarEntidadeSemDadosObrigatorios(){
        clearDB();
        Endereco end = new Endereco();
        end.setBairro("Bairro dos Amigos");
        end.setCep("ABCDE.123");
        end.setRua("Rua 7");

        Entidade entity = new Entidade();
        entity.setEndereco(end);
        entity.setNome("Entidade Vazia");
        // Gerado com https://www.4devs.com.br/gerador_de_cnpj
        entity.setTelefone2("(//) ABCD-2616");
        facadeimp.createEntidade(entity);

        //assertEquals(0, facadeimp.searchEntidade(entity).size());
    }
    
}