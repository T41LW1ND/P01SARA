package Ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el producto: ");
        String producto = sc.nextLine();
        System.out.println("Introduce su precio: ");
        double precio = sc.nextDouble();

        double variacionmensual = precio - (precio * 0.006);
        double variacionanual = precio + (precio * 0.09);

        System.out.println(producto);
        System.out.println(precio);
        System.out.printf("Precio mensual: %.2f", variacionmensual);
        System.out.printf(" ");
        System.out.printf("Precio anual: %.2f", variacionanual);
    }
}
