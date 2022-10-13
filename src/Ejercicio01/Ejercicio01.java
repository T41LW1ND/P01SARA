package Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int n2 = sc.nextInt();

        if (n1 % n2 == 0) {
            System.out.println(n1 + " es múltiplo de " + n2);
        } else {
            System.out.println("No es múltiplo.");
        }
        System.out.println("======BOOLEAN=======");
        boolean n3 = n1 % n2 == 0;
        boolean n4 = n3 == true;
        System.out.println(n4);
    }
}
