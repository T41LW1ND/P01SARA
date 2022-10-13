package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de días: ");
        int dias = sc.nextInt();

        int semanas = dias / 7;
        int diassobrantes = dias % 7;

        System.out.println(dias + " corresponden a " + semanas + " semanas y " + diassobrantes + " días sobrantes.");
    }
}
