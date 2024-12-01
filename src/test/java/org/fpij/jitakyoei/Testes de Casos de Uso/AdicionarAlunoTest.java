package org.fpij.jitakyoei;

import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.fpij.jitakyoei.model.dao.DAO;
import org.fpij.jitakyoei.model.dao.DAOImpl;
import org.fpij.jitakyoei.view.AppView;
import org.fpij.jitakyoei.view.MainAppView;
import org.fpij.jitakyoei.view.gui.AlunoBuscarPanel;
import org.fpij.jitakyoei.facade.AppFacadeImpl;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Rg;
import org.fpij.jitakyoei.model.beans.Endereco;

public class AdicionarAlunoTest {

    private static AppView fakeview;
    private static AppFacadeImpl facadeimp;

    @BeforeClass
    public static void setUpEnvironment(){
        // Criar as telas fakes
        fakeview = new MainAppView();
        facadeimp = new AppFacadeImpl(fakeview);
    }

    @Test
    public void CadastrarAlunoDadosValidos(){
        Filiado f = new Filiado();
        f.setNome("Usuário de Teste 1");
        f.setRegistroCbj("961274");
        // Gerado via https://geradornv.com.br/gerador-telefone/
        f.setTelefone1("(84) 2254-6791");
        f.setTelefone2("(92) 3534-2616");
        f.setEmail("esteemail@naoexiste.com.br");
        f.setCpf("123.123.123.12");
        f.setObservacoes("Este usuário foi criado para testes!!!");

        Rg doc_rg = new Rg("12.123.123-4", "SSP");
        f.setRg(doc_rg);

        Endereco end = new Endereco();
        end.setBairro("Bairro dos Amigos");
        end.setCep("12345.123");
        end.setCidade("Cidades dos Amigos");
        end.setEstado("SP");
        end.setNumero("123");
        end.setRua("Rua 7");
        f.setEndereco(end);

        Aluno a = new Aluno();
        a.setFiliado(f);
        facadeimp.createAluno(a);

        // Verificar se o aluno foi criado
        assertEquals(1, facadeimp.searchAluno(a).size());
    }

    @Test
    public void CadastrarAlunoDadosInvalidos(){
        Filiado f = new Filiado();
        f.setNome("Usuário de Teste 2");
        f.setRegistroCbj("NAOÉUMREGISTRO");
        // Gerado via https://geradornv.com.br/gerador-telefone/
        f.setTelefone1("(//) ABCD-6791");
        f.setTelefone2("(//) 3534-EFGH");
        f.setEmail("issoeumsite.com.br");
        f.setCpf("Não.ééé.umm-PF");
        f.setObservacoes("Este usuário nao deve ser criado! para testes!!!");

        Rg doc_rg = new Rg("12.123.123-4", "SSP");
        f.setRg(doc_rg);

        Endereco end = new Endereco();
        end.setBairro("Bairro dos Amigos");
        end.setCep("12345.123");
        end.setCidade("Cidades dos Amigos");
        end.setEstado("SP");
        end.setNumero("123");
        end.setRua("Rua 7");
        f.setEndereco(end);

        Aluno a = new Aluno();
        a.setFiliado(f);
        facadeimp.createAluno(a);

        // Verificar se o aluno foi criado
        //assertEquals(0, facadeimp.searchAluno(a).size());
    }

    @Test
    public void CadastrarAlunoSemDadosObrigatorios(){
        Filiado f = new Filiado();
        f.setObservacoes("Este usuário só tem observações?");

        Aluno a = new Aluno();
        a.setFiliado(f);
        facadeimp.createAluno(a);

        // Verificar se o aluno foi criado
        //assertEquals(0, facadeimp.searchAluno(a).size());
    }
}
