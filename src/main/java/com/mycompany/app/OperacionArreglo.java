package com.mycompany.app;

public class OperacionArreglo {

    public double encontrarNumeroMenorArray( double [] arreglo){

        double[] arrayInicial = arreglo;

        double  menor = arrayInicial[0];
        
        for (int i = 1; i < arrayInicial.length; i++) {

            if (arrayInicial[i] < menor){

                menor = arrayInicial[i];
            }

        }
        return menor;
    }
}
