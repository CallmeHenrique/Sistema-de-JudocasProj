package org.fpij.jitakyoei;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Date;

import org.fpij.jitakyoei.model.beans.Faixa;
import org.fpij.jitakyoei.util.CorFaixa;
import org.junit.BeforeClass;
import org.junit.Test;

public class FaixaTest {
    
    @Test
    public void TestarConstrutorVazio(){
        Faixa fx = new Faixa();
        assertNotEquals(null, fx);
    }

    @Test
    public void TestarConstrutorComParametros(){
        Faixa fx2 = new Faixa(CorFaixa.AMARELA, new Date());
        assertNotEquals(null, fx2);
    }

    @Test
    public void TestarCor(){
        Faixa fx = new Faixa();
        fx.setCor(CorFaixa.AZUL);
        assertEquals(CorFaixa.AZUL, fx.getCor());
    }

    @Test
    public void TestarDataDeEntrega(){
        Faixa fx = new Faixa();
        fx.setDataEntrega(new Date());
        assertEquals(new Date(), fx.getDataEntrega());
    }

    @Test
    public void TesteToString(){
        Faixa fx = new Faixa(CorFaixa.MARROM, new Date());
        assertNotEquals("", fx.toString());
    }
}
