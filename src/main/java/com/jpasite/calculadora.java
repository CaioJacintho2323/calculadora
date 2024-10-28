package com.jpasite;

public class calculadora {
    public double somar(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }

    public double divisao(double numeroUm, double numeroDois) {
        if (numeroDois == 0){
            throw new IllegalArgumentException("Argumento Ilegal, o pode ser divisivel por 0") ;
        }
        return numeroUm/numeroDois;
    }

    public double multiplicar(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }

    public double potencia(double numeroUm, double numeroDois) {

        if (numeroDois > 0) {
            return Math.pow(numeroUm, numeroDois);
        } else if (numeroDois == 0) {
            return 1;
        }
        return 0;
    }

    public double raizQuadrada(double numeroUm) {
        if(numeroUm > 0){
            return Math.sqrt(numeroUm);
        }else {
            System.out.println("nao existe raiz quadrada de numero negativo");
        }
        return 0;
    }

}

