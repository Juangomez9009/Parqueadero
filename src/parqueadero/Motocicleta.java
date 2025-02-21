package parqueadero;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String placa, String marca, int modelo, int cilindrada) {
        super(placa, marca, modelo);  // Llama al constructor de Vehiculo
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo=" + getModelo() +
                ", cilindrada=" + cilindrada +
                '}';
    }
}