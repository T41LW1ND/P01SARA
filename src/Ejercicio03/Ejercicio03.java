package Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce tu peso (en kilogramos)");
        int kgs = sc.nextInt();
        System.out.println("Introduce tu altura (en centímetros)");
        int altura = sc.nextInt();

        int imc = kgs / altura^2;
        System.out.println("IMC:" +  imc + ".");

    }
}
