
package practica1;

import java.util.Scanner;

public class practicav1 {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
       double resultado = 0;

        do {
            System.out.println("\n--- Calculadora ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Elevar al exponente");
            System.out.println("6. Calcular el residuo");
            System.out.println("0. Salir");

            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                double num1, num2;
                System.out.print("Introduce el primer número: ");
                num1 = sc.nextDouble();

                System.out.print("Introduce el segundo número: ");
                num2 = sc.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        break;
                    case 2:
                        resultado = num1 - num2;
                        break;
                    case 3:
                        resultado = num1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                            continue;  // Vuelve al inicio del bucle
                        }
                        break;
                    case 5:
                        resultado = Math.pow(num1, num2);
                        break;
                    case 6:
                        if (num2 != 0) {
                            resultado = num1 % num2;
                        } else {
                            System.out.println("Error: No se puede calcular el residuo por cero.");
                            continue;  // Vuelve al inicio del bucle
                        }
                        break;
                }

                System.out.println("Resultado: " + resultado);
            } else if (opcion == 0) {
                System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                break;  // Sale del bucle
            } else {
                System.out.println("Error: Opción no válida. Por favor, elige una opción del menú.");
            }

            System.out.print("¿Quieres realizar otra operación? (s/n): ");
            char continuar = sc.next().charAt(0);

            if (continuar != 's' && continuar != 'S') {
                System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                break;  // Sale del bucle
            }

        } while (true); 
    }
    
}
