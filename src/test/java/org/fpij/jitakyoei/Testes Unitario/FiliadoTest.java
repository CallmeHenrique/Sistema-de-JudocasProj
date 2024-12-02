package org.fpij.jitakyoei;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.model.beans.Faixa;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Rg;
import org.fpij.jitakyoei.util.CorFaixa;
import org.junit.BeforeClass;
import org.junit.Test;

public class FiliadoTest {
    
    @Test
    public void TestarID(){
        Filiado f = new Filiado();
        f.setId(10L);
        assertEquals((long)10L, (long)f.getId());
    }

    @Test
    public void TestarCPF(){
        Filiado f = new Filiado();
        f.setCpf("123.123.123-12");
        assertEquals("123.123.123-12", f.getCpf());
    }

    @Test
    public void TestarDataDeCadastro(){
        Filiado f = new Filiado();
        f.setDataCadastro(new Date());
        assertEquals(new Date(), f.getDataCadastro());
    }

    @Test
    public void TestarDataDeNascimento(){
        Filiado f = new Filiado();
        f.setDataNascimento(new Date());
        assertEquals(new Date(), f.getDataNascimento());
    }

    @Test
    public void TestarEmail(){
        Filiado f = new Filiado();
        f.setEmail("teste@teste.com.br");
        assertEquals("teste@teste.com.br", f.getEmail());
    }

    @Test
    public void TestarEndereco(){
        Filiado f = new Filiado();
        Endereco end = new Endereco();
        end.setBairro("Bairro");
        end.setCep("12345-678");
        end.setCidade("Cidade");
        end.setEstado("Estado");
        end.setNumero("123");
        end.setRua("Rua");
        f.setEndereco(end);
        assertEquals(end, f.getEndereco());
    }

    @Test
    public void TestarFaixa(){
        Faixa fx = new Faixa(CorFaixa.AMARELA, new Date());
        List<Faixa> lFaixas = new ArrayList<>();
        lFaixas.add(fx);
        Filiado f = new Filiado();
        f.setFaixas(lFaixas);
        assertEquals(lFaixas, f.getFaixas());
    }

    @Test
    public void TestarNome(){
        Filiado f = new Filiado();
        f.setNome("Nome");
        assertEquals("Nome", f.getNome());
    }

    @Test
    public void TestarTelefone1(){
        Filiado f = new Filiado();
        f.setTelefone1("(11) 91919-9191");
        assertEquals("(11) 91919-9191", f.getTelefone1());
    }

    @Test
    public void TestarTelefone2(){
        Filiado f = new Filiado();
        f.setTelefone2("(11) 91919-9191");
        assertEquals("(11) 91919-9191", f.getTelefone2());
    }

    @Test
    public void TestarObservacoes(){
        Filiado f = new Filiado();
        f.setObservacoes("OBS");
        assertEquals("OBS", f.getObservacoes());
    }

    @Test
    public void TestarRegistroCBJ(){
        Filiado f = new Filiado();
        f.setRegistroCbj("123123");
        assertEquals("123123", f.getRegistroCbj());
    }

    @Test
    public void TestarRg(){
        Filiado f = new Filiado();
        Rg rg = new Rg("123.123.123-12", "SSP");
        f.setRg(rg);
        assertEquals(rg, f.getRg());
    }

    @Test
    public void TestarToString(){
        Filiado f = new Filiado();
        assertNotEquals("", f.toString());
    }

    @Test
    public void TestarCopiaDePropriedades(){
        Filiado f = new Filiado();
        f.setId(10L);
        f.setNome("Nome");
        f.setCpf("123.123.123-12");
        f.setDataCadastro(new Date());
        f.setTelefone1("(11) 91919-9191");
        f.setTelefone2("(11) 91919-9191");
        f.setObservacoes("OBS");
        f.setRegistroCbj("123123");

        Rg rg = new Rg("123.123.123-12", "SSP");

        Endereco end = new Endereco();
        end.setBairro("Bairro");
        end.setCep("12345-678");
        end.setCidade("Cidade");
        end.setEstado("Estado");
        end.setNumero("123");
        end.setRua("Rua");
        f.setEndereco(end);

        f.setRg(rg);

        Filiado f2 = new Filiado();
        f2.copyProperties(f);

        assertEquals(f, f2);
    }

    @Test
    public void TestarHashCode(){
        Filiado f = new Filiado();
        f.setId(10L);
        assertEquals((long)10L, (long)f.hashCode());
    }

    @Test
    public void TestarIgualdadeDeFiliados(){
        Filiado f = new Filiado();
        f.setId(10L);
        f.setNome("Nome");

        Filiado f2 = new Filiado();
        f2.setId(10L);
        f2.setNome("Nome");

        assertEquals(true, f.equals(f2));
    }

    @Test
    public void TestarDesigualdadeDeFiliadosNome(){
        Filiado f = new Filiado();
        f.setId(10L);
        f.setNome("Nome");

        Filiado f2 = new Filiado();
        f2.setId(10L);
        f2.setNome("AAA");

        assertEquals(false, f.equals(f2));
    }

    @Test
    public void TestarDesigualdadeDeFiliadosId(){
        Filiado f = new Filiado();
        f.setId(10L);
        f.setNome("Nome");

        Filiado f2 = new Filiado();
        f2.setId(12L);
        f2.setNome("Nome");

        assertEquals(false, f.equals(f2));
    }

    @Test
    public void TestarDesigualdadeDeFiliadosObjeto(){
        Filiado f = new Filiado();
        f.setId(10L);
        f.setNome("Nome");

        assertEquals(false, f.equals("AAA"));
    }
}