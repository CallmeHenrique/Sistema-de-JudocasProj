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
    public void TestarRua(){
        end.setRua("Rua");
        assertEquals("Rua", end.getRua());
    }

    @Test
    public void TestarBairro(){
        end.setBairro("Bairro");
        assertEquals("Bairro", end.getBairro());
    }

    @Test
    public void TestarCEP(){
        end.setCep("12345-678");
        assertEquals("12345-678", end.getCep());
    }

    @Test
    public void TestarCidade(){
        end.setCidade("Cidade");
        assertEquals("Cidade", end.getCidade());
    }

    @Test
    public void TestarEstado(){
        end.setEstado("Estado");
        assertEquals("Estado", end.getEstado());
    }

    @Test
    public void TestarNumero(){
        end.setNumero("123");
        assertEquals("123", end.getNumero());
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
