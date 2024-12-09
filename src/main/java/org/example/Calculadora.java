package org.example;

import java.util.Scanner;

public class Calculadora {

    public static Double sumar(Double a, Double b) {
        return a + b;
    }

    public static Double restar(Double a, Double b) {
        return a - b;
    }

    public static Double multiplicar(Double a, Double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de Víctor.");
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Elige una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = restar(num1, num2);
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}

