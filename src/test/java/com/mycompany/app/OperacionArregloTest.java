package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;

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

    @Test
    public void testListaNumerosAleatorios(){

        double [] arreglo1= cut.listaNumerosAleatorios(4);
        double [] arreglo2= cut.listaNumerosAleatorios(4);

        int longitud = 4;

        // Verifica que el tamaño de los arrays sean iguales a la longitud especificada
        assertEquals(longitud, arreglo1.length);
        assertEquals(longitud, arreglo2.length);

         // Comparar los dos arrays para comprabar que no sean iguales
        assertFalse(Arrays.equals(arreglo1, arreglo2));

    }
}
