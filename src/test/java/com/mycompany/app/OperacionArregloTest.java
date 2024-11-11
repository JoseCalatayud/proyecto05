package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OperacionArregloTest {
    
    OperacionArreglo cut = new OperacionArreglo();

    @Test
    public void testEncontrarMayor () {
        double [] ejemploArreglo = {2, 44, 54, 1, -5, 8};
        double numeroEsperado = 54;
        assertEquals(numeroEsperado, cut.encontrarMayor(ejemploArreglo));

    }

    @Test
    public void testEncontrarMenor () {
        double [] ejemploArreglo = {1.3, 5.5, 0.6, 9.8, -5.6};
        double numeroEsperado = -5.6;
        assertEquals(numeroEsperado, cut.encontrarNumeroMenorArray(ejemploArreglo));

    }
}
