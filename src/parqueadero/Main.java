package parqueadero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();

        int opcion;
        do {
            System.out.println("\n=== GESTIÓN DE PARQUEADERO ===");
            System.out.println("1. Registrar Vehículo");
            System.out.println("2. Registrar Salida");
            System.out.println("3. Consultar Estado");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Tipo de vehículo (1. Automóvil | 2. Motocicleta | 3. Camión): ");
                    int tipo = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    System.out.print("Placa: ");
                    String placa = sc.nextLine();

                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Modelo: ");
                    int modelo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Tipo de Combustible: ");
                    String combustible = sc.nextLine();

                    Vehiculo vehiculo = null;
                    if (tipo == 1) {
                        vehiculo = new Automovil(placa, marca, modelo, combustible);
                    } else if (tipo == 2) {
                        vehiculo = new Motocicleta(placa, marca, modelo, 150); // Ejemplo
                    } else if (tipo == 3) {
                        vehiculo = new Camion(placa, marca, modelo, 5.0); // Ejemplo
                    }

                    if (vehiculo != null) {
                        parqueadero.registrarEntrada(vehiculo);
                    } else {
                        System.out.println("⚠️ Tipo de vehículo no válido.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la placa del vehículo que sale: ");
                    String placaSalida = sc.nextLine();
                    parqueadero.registrarSalida(placaSalida);
                    break;

                case 3:
                    System.out.println("\n🅿️ Vehículos en el Parqueadero:");
                    for (Vehiculo v : parqueadero.consultarEstado()) {
                        System.out.println(v);
                    }
                    break;

                case 0:
                    System.out.println("🚗 Saliendo del sistema. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("⚠️ Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}