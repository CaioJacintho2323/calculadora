package com.jpasite;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculadora cal = new calculadora();
        int num1 = 0;
        int num2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("1-Somar,2-subtrair,3-multiplicar,4-dividir,5-potenciar,6-raiz quadrada");
        int opc = sc.nextInt();

        if (opc == 6) {
            System.out.println("digite o numero: ");
            num1 = sc.nextInt();
        } else {
            System.out.println("digite o primeiro numero: ");
            num1 = sc.nextInt();
            System.out.println("digite o segundo numero: ");
            num2 = sc.nextInt();
        }


        switch (opc) {
            case 1:
                System.out.println(cal.somar(num1, num2));
                break;
            case 2:
                System.out.println(cal.subtrair(num1, num2));
                break;
            case 3:
                System.out.println(cal.multiplicar(num1, num2));
                break;
            case 4:
                System.out.println(cal.divisao(num1, num2));
                break;
            case 5:
                System.out.println(cal.potencia(num1, num2));
                break;
            case 6:
                System.out.println(cal.raizQuadrada(num1));
            default:
                System.out.println("numero escolhido invalido");

        }

        sc.close();

    }
}