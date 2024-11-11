package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OperacionArregloTest {
    
    OperacionArreglo cut = new OperacionArreglo();

    @Test
    public void encontrarMayor () {
        double [] ejemploArreglo = {2, 44, 54, 1, -5, 8};
        double numeroEsperado = 54;
        assertEquals(numeroEsperado, cut.encontrarMayor(ejemploArreglo));

    }
}
