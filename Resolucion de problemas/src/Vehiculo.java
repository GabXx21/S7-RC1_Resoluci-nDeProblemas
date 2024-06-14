public class Vehiculo {
    private String matricula;
    private float capacidadCarga;
    private float consumoGasolina;
    private float cargaActual;

    public Vehiculo(String matricula, float capacidadCarga, float consumoGasolina) {
        this.matricula = matricula;
        this.capacidadCarga = capacidadCarga;
        this.consumoGasolina = consumoGasolina;
        this.cargaActual = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public float getConsumoGasolina() {
        return consumoGasolina;
    }

    public float getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(float cargaActual) {
        if (cargaActual <= this.capacidadCarga) {
            this.cargaActual = cargaActual;
        } else {
            System.out.println("La carga excede la capacidad del vehículo.");
        }
    }
}
