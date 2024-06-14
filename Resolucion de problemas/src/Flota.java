import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Vehiculo> vehiculos;

    public Flota() {
        vehiculos = new ArrayList<>();
    }

    public void añadirVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public Vehiculo mejorVehiculo(float carga) {
        Vehiculo mejorVehiculo = null;
        for (Vehiculo v : vehiculos) {
            if (v.getCapacidadCarga() >= carga &&
                    (mejorVehiculo == null || v.getConsumoGasolina() < mejorVehiculo.getConsumoGasolina())) {
                mejorVehiculo = v;
            }
        }
        return mejorVehiculo;
    }

    public void actualizarCarga(String matricula, float carga) {
        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equals(matricula)) {
                v.setCargaActual(carga);
                return;
            }
        }
        System.out.println("Vehículo no encontrado.");
    }
}