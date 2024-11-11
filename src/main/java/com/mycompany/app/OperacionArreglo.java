package com.mycompany.app;

public class OperacionArreglo {

    public double encontrarMayor(double[] arreglo) {

        double numeroMayor = 0;
        for (double d : arreglo) {
            if (d > numeroMayor) {
                numeroMayor = d;
            }
        }
        return numeroMayor;

    }

    public double encontrarNumeroMenorArray(double[] arreglo) {

        double[] arrayInicial = arreglo;

        double menor = arrayInicial[0];

        for (int i = 1; i < arrayInicial.length; i++) {

            if (arrayInicial[i] < menor) {

                menor = arrayInicial[i];
            }

        }
        return menor;

    }
}
