package Ocp.refatorado;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HtmlTest {
    @Test
    public void deveRetornarSucesso() {
        Arquivo arquivo = new Arquivo("Html");
        arquivo.setConteudo("texto");
        assertEquals("HTML: texto", arquivo.imprimir());
    }

}