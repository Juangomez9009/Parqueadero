package parqueadero;

public class Automovil extends Vehiculo {
    private String tipoCombustible;

    public Automovil(String placa, String marca, int modelo, String tipoCombustible) {
        super(placa, marca, modelo);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "Automóvil | Placa: " + getPlaca() +
               " | Marca: " + getMarca() +
               " | Modelo: " + getModelo() +
               " | Combustible: " + tipoCombustible;
    }
}
