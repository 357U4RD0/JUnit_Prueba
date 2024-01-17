//Estuardo Castro - 23890
//16.01.2023
//En este código crearé una calculadora muy pequeña encargada de sumar dos números
//Este programa tiene la finalidad de probar el JUnit

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(num1, num2);

        System.out.println("La suma es: " + resultado);
        System.out.println("Espero te haya encantado este gran proyecto =)");

        scanner.close();
    }
}
