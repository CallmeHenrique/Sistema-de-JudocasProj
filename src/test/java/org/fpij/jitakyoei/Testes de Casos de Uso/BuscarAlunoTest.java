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

public class BuscarAlunoTest {
    private static Filiado filiado;
    private static Aluno aluno;
    private static List<Aluno> alunoList;
    private static DAO<Aluno> alunoDao;

    private static AppView fakeview;
    private static AppFacadeImpl facadeimp;

    @BeforeClass
    public static void setUpEnvironment(){
        // Deletar os alunos do Banco de Dados
        alunoDao = new DAOImpl<Aluno>(Aluno.class);
        List<Aluno> lista = alunoDao.list();
        for(Aluno al : lista){
            alunoDao.delete(al);
        }

        // Criar as telas fakes
        fakeview = new MainAppView();
        facadeimp = new AppFacadeImpl(fakeview);

        // Criar o aluno e adicionar no Banco
        filiado = new Filiado();
        filiado.setNome("Teste Nome");
        filiado.setCpf("123.456.789-10");
        filiado.setDataNascimento(new Date());
        filiado.setDataCadastro(new Date());

        aluno = new Aluno();
        aluno.setFiliado(filiado);

        facadeimp.createAluno(aluno);
    }

    @Test
    public void BuscarAlunoValido(){
        assertEquals(1, facadeimp.searchAluno(aluno).size());
    }

    @Test
    public void BuscarAlunoInvalido(){
        Filiado f = new Filiado();
        f = new Filiado();
        f.setNome("Nome Errado");
        f.setCpf("123.123.123-12");
        f.setDataNascimento(new Date());
        f.setDataCadastro(new Date());
        Aluno a = new Aluno();
        a.setFiliado(f);

        assertEquals(0, facadeimp.searchAluno(a).size());
    }
}
