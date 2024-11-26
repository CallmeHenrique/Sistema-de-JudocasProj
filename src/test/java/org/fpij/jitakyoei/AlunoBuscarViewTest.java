package org.fpij.jitakyoei;

import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.fpij.jitakyoei.model.dao.DAO;
import org.fpij.jitakyoei.model.dao.DAOImpl;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Filiado;

public class AlunoBuscarViewTest {
    private static Filiado filiado;
    private static Aluno aluno;
    private static List<Aluno> alunoList;
    private static DAO<Aluno> alunoDao;

    @BeforeClass
    public static void setUpEnvironment(){
        alunoDao = new DAOImpl<Aluno>(Aluno.class);
        clearDB();
        filiado = new Filiado();
        filiado.setNome("Teste Nome");
        filiado.setCpf("123.456.789-10");
        filiado.setDataNascimento(new Date());
        filiado.setDataCadastro(new Date());
        filiado.setId(123123L);

        aluno = new Aluno();
        aluno.setFiliado(filiado);
        
        alunoDao.save(aluno);
    }

    public static void clearDB(){
        List<Aluno> lista = alunoDao.list();
        for(Aluno a : lista){
            alunoDao.delete(a);
        }
    }

    @Test
    public void BuscarAlunoCadastradoViaNome(){
        Filiado f = new Filiado();
        f.setNome("Teste Nome");
        Aluno a = new Aluno();
        a.setFiliado(f);

        List<Aluno> lista_aluno = alunoDao.search(a);
        assertEquals(1, lista_aluno.size());
    }

    @Test
    public void BuscarAlunoCadastradoViaID(){
        Filiado f = new Filiado();
        f.setId(123123L);;
        Aluno a = new Aluno();
        a.setFiliado(f);

        List<Aluno> lista_aluno = alunoDao.search(a);
        assertEquals(1, lista_aluno.size());
    }

    @Test
    public void BuscarAlunoNaoExistenteNoBancoDeDadosViaNome(){
        Filiado f = new Filiado();
        f.setNome("Nome Errado");
        Aluno a = new Aluno();
        a.setFiliado(f);

        List<Aluno> lista_aluno = alunoDao.search(a);
        assertEquals(0, lista_aluno.size());
    }

    @Test
    public void BuscarAlunoNaoExistenteNoBancoDeDadosViaID(){
        Filiado f = new Filiado();
        f.setId(122222L);;
        Aluno a = new Aluno();
        a.setFiliado(f);

        List<Aluno> lista_aluno = alunoDao.search(a);
        assertEquals(0, lista_aluno.size());
    }
}
