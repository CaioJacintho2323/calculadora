package com.jpasite;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        calculadora cal = new calculadora();

        System.out.println("soma " + cal.somar(1,1));
        System.out.println("divisao " + cal.divisao(10,2));
        System.out.println("potencia " + cal.potencia(1,0));
        System.out.println("multiplicacao " + cal.multiplicar(10,10));
        System.out.println("raiz quadrada " + cal.raizQuadrada(25));


    }
}