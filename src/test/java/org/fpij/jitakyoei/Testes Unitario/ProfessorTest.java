package org.fpij.jitakyoei;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProfessorTest {
    private static Professor prof;
    private static Filiado fil;

    @BeforeClass
    public static void setUpEnvironment(){
        fil = new Filiado();
        fil.setNome("Nome");
        fil.setCpf("123.123.123-12");
        fil.setId(100L);
        prof = new Professor();
    }

    @Test
    public void TestarFiliado(){
        prof.setFiliado(fil);
        assertEquals(fil, prof.getFiliado());
    }

    @Test
    public void TestarEntidades(){
        List<Entidade> ents = prof.getEntidades();
        Entidade entity = new Entidade();

        for(int i = 0; i < 4; i++){
            entity.setCnpj("123" + String.valueOf(i));
            ents.add(entity);
        }

        prof.setEntidades(ents);
        assertEquals(ents, prof.getEntidades());
    }

    @Test
    public void TestarToString(){
        prof.setFiliado(fil);
        assertNotEquals("", prof.toString());
    }

    @Test
    public void ValidarHashCodeComID(){
        assertEquals(29 * 7 + prof.getFiliado().getId(), prof.hashCode());
    }

    @Test
    public void ValidarHashCodeSemID(){
        prof.getFiliado().setId(null);
        assertEquals(29 * 7, prof.hashCode());
    }

    @Test
    public void CompararProfessoresIguais(){
        Filiado filiado = new Filiado();
        filiado.setNome("Nome");
        filiado.setCpf("123.123.123-12");
        filiado.setId(100L);

        Professor p = new Professor();
        p.setFiliado(filiado);

        prof.setFiliado(fil);
        prof.getFiliado().setId(100L);

        assertEquals(true, prof.equals(p));
    }

    @Test
    public void CompararProfessoresDiferentes(){
        Filiado filiado = new Filiado();
        filiado.setId(10L);
        
        prof.setFiliado(fil);

        assertEquals(false, prof.equals(filiado));
    }
}
