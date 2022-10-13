package Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce tu peso (en kilogramos)");
        double kgs = sc.nextDouble();
        System.out.println("Introduce tu altura (en centímetros)");
        double altura = sc.nextInt();
        double imc = kgs / (altura * altura);
        System.out.printf("IMC: %.2f",  imc);

    }
}
