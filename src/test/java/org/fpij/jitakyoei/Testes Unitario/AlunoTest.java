package org.fpij.jitakyoei;

import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;

public class AlunoTest {
    private static Entidade ent;
    private static Professor prof;
    private static Filiado fil;
    private static Aluno alu;

    @BeforeClass
    public static void setEnvironment(){
        fil = new Filiado();
        fil.setNome("Teste");

        ent = new Entidade();
        ent.setNome("NomeEntidade");
        ent.setCnpj("123123123");

        prof = new Professor();
        Filiado prof_f = new Filiado();
        prof_f.setNome("Prof");
        prof.setFiliado(prof_f);

        alu = new Aluno();
        alu.setEntidade(ent);
        alu.setFiliado(fil);
        alu.setProfessor(prof);
    }

    @Test
    public void GetESetFiliado(){
        Aluno a = new Aluno();
        a.setFiliado(fil);
        assertEquals(fil, a.getFiliado());
    }

    @Test
    public void GetESetProfessor(){
        Aluno a = new Aluno();
        a.setProfessor(prof);
        assertEquals(prof, a.getProfessor());
    }

    @Test
    public void GetESetEntidade(){
        Aluno a = new Aluno();
        a.setEntidade(ent);
        assertEquals(ent, a.getEntidade());
    }

    @Test
    public void VerificarRetornoDoToString(){
        Aluno a = new Aluno();
        a.setFiliado(fil);

        // Verifica se não está vazio o toString
        assertNotEquals("", a.toString());
    }

    @Test
    public void TestaIgualdadeDeAlunoPorId(){
        Aluno a = new Aluno();
        a.setEntidade(ent);
        a.setFiliado(fil);
        a.setProfessor(prof);
        assertEquals(true, a.equals(alu));
    }

    @Test
    public void TestaDesigualdadeDeAlunoPorId(){
        Aluno a = new Aluno();

        Filiado f = new Filiado();
        f.setNome("Teste");
        f.setId(15L);

        a.setFiliado(f);
        a.setProfessor(prof);
        a.setEntidade(ent);

        alu.getFiliado().setId(10L);

        assertEquals(false, a.equals(alu));
    }

    @Test
    public void TestaDesigualdadeDeAluno(){
        assertEquals(false, alu.equals(prof));
    }

    @Test
    public void VerificaHashCode(){
        alu.getFiliado().setId(1000L);
        
        int val_hash = 29 * 7 + (int)(long) alu.getFiliado().getId();
        assertEquals(val_hash, alu.hashCode());
    }

    @Test
    public void VerificaHashCodeNull(){
        alu.getFiliado().setId(null);
        
        int val_hash = 29 * 7;
        assertEquals(val_hash, alu.hashCode());
    }

    @Test
    public void CopiaAlunoParaOutro(){
        Aluno a = new Aluno();
        a.setEntidade(ent);
        Filiado f = new Filiado();
        f.setNome("EsseVaiSerCopiado");
        a.setFiliado(f);
        a.setProfessor(prof);

        alu.copyProperties(a);

        assertEquals(true, alu.equals(a));
    }
}