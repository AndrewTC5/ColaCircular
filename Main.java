package ColasCircular;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        operacionesConPilaCircular();
    }

    public static void operacionesConPilaCircular() {
        System.out.print("Ingrese el tamaño maximo de archivos en espera: ");
        int tamanio = scanner.nextInt();

        ColaCirc cola = new ColaCirc(tamanio);

        int opcion;
        do {
            System.out.println("\n--- OPCIONES ---");
            System.out.println("1. Seleccione el archivo");
            System.out.println("2. Realizar Impresion");
            System.out.println("3. Verificar si la cola está llena");
            System.out.println("4. Verificar si la cola está vacía");
            System.out.println("5. Mostrar el frente de la cola");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del Archivo que desea Imprimir: ");
                    String archivo = scanner.next();
                    cola.encolar(archivo);
                    break;

                case 2:
                    cola.desencolar();
                    break;

                case 3:
                    if (cola.llena()) {
                        System.out.println("La cola está llena.");
                    } else {
                        System.out.println("La cola no está llena.");
                    }
                    break;

                case 4:
                    if (cola.vacia()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("La cola no está vacía.");
                    }
                    break;

                case 5:
                    cola.frente();
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}