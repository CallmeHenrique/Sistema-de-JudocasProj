package org.fpij.jitakyoei;

import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.fpij.jitakyoei.util.CorFaixa;

public class CorFaixaTest {
    
    @Test
    public void ValidarDescricaoDasFaixas(){
        for(CorFaixa cf : CorFaixa.values()){
            // Verificar se todas as faixas tem descrição
            assertNotEquals("", cf.getDescricao());

            // Verificar se ambos retornam a mesma coisa
            assertEquals(cf.getDescricao(), cf.toString());
        }
    }

    @Test
    public void ValidarCoresDasFaixas(){
        List<CorFaixa> cf_list = CorFaixa.getCoresFaixa();

        // Verificar se todas as cores do getCoresFaixa estão no ENUM
        assertEquals(CorFaixa.values().length, cf_list.size());
    }
}
