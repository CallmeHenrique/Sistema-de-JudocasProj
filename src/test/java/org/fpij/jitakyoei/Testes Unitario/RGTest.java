package org.fpij.jitakyoei;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.fpij.jitakyoei.model.beans.Rg;
import org.junit.BeforeClass;
import org.junit.Test;

public class RGTest {
    
    @Test
    public void TestarConstrutorVazio(){
        Rg rg1 = new Rg();
        assertNotEquals(null, rg1);
    }

    @Test
    public void TestarConstrutorComParametros(){
        Rg rg2 = new Rg("12.123.123-1", "SSP");
        assertNotEquals(null, rg2);
    }

    @Test
    public void TestarNumero(){
        Rg rg1 = new Rg();
        rg1.setNumero("12.123.123-1");
        assertEquals("12.123.123-1", rg1.getNumero());
    }

    @Test
    public void TestarOrgaoExpedidor(){
        Rg rg1 = new Rg();
        rg1.setOrgaoExpedidor("SSP");
        assertEquals("SSP", rg1.getOrgaoExpedidor());
    }

    @Test
    public void TestarHashCode(){
        Rg rg = new Rg("12.123.123-1", "SSP");
        assertEquals(rg.getNumero().hashCode() + rg.getOrgaoExpedidor().hashCode(), rg.hashCode());
    }

    @Test
    public void TestarIgualdadeRG(){
        Rg rg = new Rg("12.123.123-1", "SSP");
        Rg rg2 = new Rg("12.123.123-1", "SSP");
        assertEquals(true, rg.equals(rg2));
    }

    @Test
    public void TestarDesigualdadeRGTipoDeObjeto(){
        Rg rg = new Rg("12.123.123-1", "SSP");
        assertEquals(false, rg.equals("Teste"));
    }

    @Test
    public void TestarDesigualdadeRGOrgao(){
        Rg rg = new Rg("12.123.123-1", "SSP");
        Rg rg2 = new Rg("12.123.123-1", "SRJ");
        assertEquals(false, rg.equals(rg2));
    }

    @Test
    public void TestarDesigualdadeRGNumero(){
        Rg rg = new Rg("12.123.123-1", "SSP");
        Rg rg2 = new Rg("12.123.113-1", "SSP");
        assertEquals(false, rg.equals(rg2));
    }
}
