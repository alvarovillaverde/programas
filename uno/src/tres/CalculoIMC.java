package tres;

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {

        //atributos
        double peso; //en kg
        double estatura; //en metros

        //escaner
        Scanner sc = new Scanner(System.in);

        //entradas
        System.out.println("Introduzca su peso en kg: ");
        peso = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduzca su altura en metros: ");
        estatura = sc.nextDouble();

        //calculo del IMC
        double IMC = peso / Math.pow(estatura, 2);

        //resultado
        if (IMC < 16) {
            System.out.println("Delgadez severa");
        } else if (IMC >= 16 && IMC < 17) {
            System.out.println("Delgadez moderada");
        } else if (IMC >= 17 && IMC < 18.5) {
            System.out.println("Delgadez leve");
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.println("Peso normal");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.println("Sobrepeso");
        } else if (IMC >= 30 && IMC < 35) {
            System.out.println("Obesidad leve");
        } else if (IMC >= 35 && IMC < 40) {
            System.out.println("Obesidad moderada");
        } else if (IMC >= 40) {
            System.out.println("Obesidad mórbida");
        }
        sc.close(); 
    }
}
