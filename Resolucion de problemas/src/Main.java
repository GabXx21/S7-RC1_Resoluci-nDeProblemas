import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flota flota = new Flota();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Añadir vehículo");
            System.out.println("2. Actualizar carga de un vehículo");
            System.out.println("3. Determinar mejor vehículo para una carga");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la matrícula del vehículo:");
                    String matricula = scanner.nextLine();
                    System.out.println("Ingrese la capacidad de carga del vehículo (kg):");
                    float capacidadCarga = scanner.nextFloat();
                    System.out.println("Ingrese el consumo de gasolina del vehículo (galones/km):");
                    float consumoGasolina = scanner.nextFloat();
                    scanner.nextLine(); // Consumir el salto de línea
                    flota.añadirVehiculo(new Camion(matricula, capacidadCarga, consumoGasolina));
                    System.out.println("Vehículo añadido.");
                    break;
                case 2:
                    System.out.println("Ingrese la matrícula del vehículo:");
                    String matriculaCarga = scanner.nextLine();
                    System.out.println("Ingrese la nueva carga del vehículo (kg):");
                    float nuevaCarga = scanner.nextFloat();
                    scanner.nextLine(); // Consumir el salto de línea
                    flota.actualizarCarga(matriculaCarga, nuevaCarga);
                    break;
                case 3:
                    System.out.println("Ingrese la carga a transportar (kg):");
                    float carga = scanner.nextFloat();
                    scanner.nextLine(); // Consumir el salto de línea
                    Vehiculo mejorVehiculo = flota.mejorVehiculo(carga);
                    if (mejorVehiculo != null) {
                        System.out.println("El mejor vehículo para transportar la carga es: " + mejorVehiculo.getMatricula());
                    } else {
                        System.out.println("No hay vehículos disponibles para transportar la carga.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
