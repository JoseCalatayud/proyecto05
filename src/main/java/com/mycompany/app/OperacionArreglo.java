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
}
