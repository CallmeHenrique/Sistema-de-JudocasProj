package org.fpij.jitakyoei;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.junit.BeforeClass;
import org.junit.Test;

public class EntidadeTest {
    
    @Test
    public void TestarCNPJ(){
        Entidade e = new Entidade();
        e.setCnpj("93.840.690/0001-78");
        assertEquals("93.840.690/0001-78", e.getCnpj());
    }

    @Test
    public void TestarEndereco(){
        Entidade e = new Entidade();
        Endereco end = new Endereco();
        end.setBairro("Bairro dos Amigos");
        end.setCep("12345.123");
        end.setCidade("Cidades dos Amigos");
        end.setEstado("SP");
        end.setNumero("123");
        end.setRua("Rua 7");
        e.setEndereco(end);
        assertEquals(end, e.getEndereco());
    }

    @Test
    public void TestarTelefone1(){
        Entidade e = new Entidade();
        e.setTelefone1("(11) 91234-1234");
        assertEquals("(11) 91234-1234", e.getTelefone1());
    }

    @Test
    public void TestarTelefone2(){
        Entidade e = new Entidade();
        e.setTelefone2("(11) 91234-1234");
        assertEquals("(11) 91234-1234", e.getTelefone2());
    }

    @Test
    public void TestarNome(){
        Entidade e = new Entidade();
        e.setNome("Entidade X");
        assertEquals("Entidade X", e.getNome());
    }

    @Test
    public void TestarToString(){
        Entidade e = new Entidade();
        e.setNome("Entidade X");
        assertEquals("Entidade X", e.toString());
    }

    @Test
    public void TestarCopiaDeUmaEntidadeParaOutra(){
        Entidade e = new Entidade();
        Endereco end = new Endereco();
        end.setBairro("Bairro dos Amigos");
        end.setCep("12345.123");
        end.setCidade("Cidades dos Amigos");
        end.setEstado("SP");
        end.setNumero("123");
        end.setRua("Rua 7");
        e.setEndereco(end);
        e.setNome("Entidade X");
        e.setCnpj("93.840.690/0001-78");
        e.setTelefone1("(11) 91234-1234");
        e.setTelefone2("(11) 91234-1234");

        Entidade e2 = new Entidade();
        e2.copyProperties(e);

        assertEquals(e, e2);
    }

    @Test
    public void TestarIgualdadeDeEntidades(){
        Entidade e = new Entidade();
        e.setNome("Entidade X");

        Entidade e2 = new Entidade();
        e2.setNome("Entidade X");

        assertEquals(true, e2.equals(e));
    }

    @Test
    public void TestarDesiualdadeDeEntidadesObjeto(){
        Entidade e = new Entidade();
        e.setNome("Entidade X");

        assertEquals(false, e.equals("Isso é um string"));
    }

    @Test
    public void TestarDesiualdadeDeEntidadesNome(){
        Entidade e = new Entidade();
        e.setNome("Entidade X");

        Entidade e2 = new Entidade();
        e2.setNome("Entidade Y");

        assertEquals(false, e.equals(e2));
    }

    @Test
    public void TestarHashCodeNull(){
        Entidade e = new Entidade();
        e.setNome(null);
        assertEquals(29 * 7, e.hashCode());
    }

    @Test
    public void TestarHashCodePreenchido(){
        Entidade e = new Entidade();
        e.setNome("AA");
        assertEquals(29 * 7 + e.getNome().hashCode(), e.hashCode());
    }
}
