package org.fpij.jitakyoei;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.fpij.jitakyoei.model.beans.Endereco;
import org.junit.BeforeClass;
import org.junit.Test;

public class EnderecoTest {
    private static Endereco end;

    @BeforeClass
    public static void setUpEnvironment(){
        end = new Endereco();
    }

    @Test
    public void TestarGetESets(){
        end.setBairro("Bairro");
        end.setCep("12345-678");
        end.setCidade("Cidade");
        end.setEstado("Estado");
        end.setNumero("123");
        end.setRua("Rua");

        assertEquals("Bairro", end.getBairro());
        assertEquals("12345-678", end.getCep());
        assertEquals("Cidade", end.getCidade());
        assertEquals("Estado", end.getEstado());
        assertEquals("123", end.getNumero());
        assertEquals("Rua", end.getRua());
    }

    @Test
    public void TestarToString(){
        end.setBairro("Bairro");
        end.setCep("12345-678");
        end.setCidade("Cidade");
        end.setEstado("Estado");
        end.setNumero("123");
        end.setRua("Rua");
        assertNotEquals("", end.toString());
    }
}
