package Ocp.refatorado;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void deveRetornarSucesso() {
        Arquivo arquivo = new Arquivo("Email");
        arquivo.setConteudo("texto");
        assertEquals("E-mail: texto", arquivo.imprimir());
    }

}