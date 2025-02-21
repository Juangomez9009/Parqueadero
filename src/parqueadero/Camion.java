package parqueadero;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String placa, String marca, int modelo, double capacidadCarga) {
        super(placa, marca, modelo);  // Llama al constructor de Vehiculo
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo=" + getModelo() +
                ", capacidadCarga=" + capacidadCarga +
                '}';
    }
}