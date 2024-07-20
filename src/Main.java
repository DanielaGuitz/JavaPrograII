import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}



import java.util.Scanner;

public class MenuEjercicios {

    // Función existente
    public static void holaMundo() {
        System.out.println("Hola, Mundo!");
    }

    // Suma de dos numero
    public static void sumaDeDosNumeros(Scanner scanner) {
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }

    //Numero par o impar
    public static void numeroParOImpar(Scanner scanner) {
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " es un número par.");
        } else {
            System.out.println(num + " es un número impar.");
        }
    }

    // Factorial de un número
    public static void factorialDeUnNumero(Scanner scanner) {
        System.out.print("Ingresa un número para calcular su factorial: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }

    //  Tabla de multiplicar
    public static void tablaDeMultiplicar(Scanner scanner) {
        System.out.print("Ingresa un número para mostrar su tabla de multiplicar: ");
        int num = scanner.nextInt();

        System.out.println("Tabla de multiplicar de " + num + " en orden ascendente:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        System.out.println("Tabla de multiplicar de " + num + " en orden descendente:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // Encontrar el número más grande y el más pequeño
    public static void encontrarMayorYMenor(Scanner scanner) {
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int numero;

        System.out.println("Ingresa una serie de números (ingresa un número negativo para terminar):");
        do {
            numero = scanner.nextInt();
            if (numero >= 0) {
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        } while (numero >= 0);

        System.out.println("El número más grande es: " + mayor);
        System.out.println("El número más pequeño es: " + menor);
    }

    // Funcion principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    sumaDeDosNumeros(scanner);
                    break;
                case 3:
                    numeroParOImpar(scanner);
                    break;
                case 4:
                    factorialDeUnNumero(scanner);
                    break;
                case 5:
                    tablaDeMultiplicar(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 6);

        scanner.close();
    }
}