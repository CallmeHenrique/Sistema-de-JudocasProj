package org.fpij.jitakyoei;

import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.model.beans.ProfessorEntidade;

public class ProfessorEntidadeTest {
    
    @Test
    public void TestarConstrutor(){
        Entidade e = new Entidade();
        Professor p = new Professor();
        ProfessorEntidade ep = new ProfessorEntidade(p, e);
        assertNotEquals(null, ep);
    }

    @Test
    public void TestarCriacaoProfessor(){
        Entidade e = new Entidade();
        Professor p = new Professor();
        ProfessorEntidade ep = new ProfessorEntidade(p, e);

        Professor p2 = new Professor();
        ep.setProfessor(p2);

        assertEquals(p2, ep.getProfessor());
    }

    @Test
    public void TestarCriacaoEntidade(){
        Entidade e = new Entidade();
        Professor p = new Professor();
        ProfessorEntidade ep = new ProfessorEntidade(p, e);

        Entidade e2 = new Entidade();
        ep.setEntidade(e2);

        assertEquals(e2, ep.getEntidade());
    }

    @Test
    public void TestarDesigualdadeProfessorEntidadeObjeto(){
        Entidade e = new Entidade();
        Professor p = new Professor();
        ProfessorEntidade ep = new ProfessorEntidade(p, e);

        assertEquals(false, ep.equals("WW"));
    }

    @Test
    public void TestarDesigualdadeProfessorEntidadeId(){
        Entidade e = new Entidade();
        Professor p = new Professor();
        Filiado fil = new Filiado();
        Professor p2 = new Professor();
        Filiado fil2 = new Filiado();

        e.setNome("Entidade X");

        fil.setNome("Nome");
        fil.setId(100L);
        p.setFiliado(fil);

        ProfessorEntidade ep = new ProfessorEntidade(p, e);

        fil2.setId(10L);
        p2.setFiliado(fil2);
        ProfessorEntidade ep2 = new ProfessorEntidade(p2, e);

        assertEquals(false, ep.equals(ep2));
    }

    @Test
    public void TestarDesigualdadeProfessorEntidadeNome(){
        Entidade e = new Entidade();
        Professor p = new Professor();
        Filiado fil = new Filiado();
        Entidade e2 = new Entidade();

        e.setNome("Entidade X");

        fil.setNome("Nome");
        fil.setId(100L);
        p.setFiliado(fil);

        ProfessorEntidade ep = new ProfessorEntidade(p, e);

        e2.setNome("AAAAA");
        ProfessorEntidade ep2 = new ProfessorEntidade(p, e2);

        assertEquals(false, ep.equals(ep2));
    }

    @Test
    public void TestarIgualdadeProfessorEntidade(){
        Entidade e = new Entidade();
        Professor p = new Professor();
        Filiado fil = new Filiado();

        e.setNome("Entidade X");

        fil.setNome("Nome");
        fil.setId(100L);
        p.setFiliado(fil);

        ProfessorEntidade ep = new ProfessorEntidade(p, e);

        ProfessorEntidade ep2 = new ProfessorEntidade(p, e);

        assertEquals(true, ep.equals(ep2));
    }

    @Test
    public void TestarHashCode(){
        Entidade e = new Entidade();
        Professor p = new Professor();
        Filiado fil = new Filiado();

        e.setNome("Entidade X");

        fil.setNome("Nome");

        ProfessorEntidade ep = new ProfessorEntidade(p, e);

        assertEquals(p.hashCode() + e.hashCode(), ep.hashCode());
    }
}