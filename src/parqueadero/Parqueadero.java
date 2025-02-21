package parqueadero;

import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private List<Vehiculo> vehiculos;

    public Parqueadero() {
        this.vehiculos = new ArrayList<>();
    }

    // Registrar entrada con validación de duplicados
    public void registrarEntrada(Vehiculo vehiculo) {
        if (buscarVehiculo(vehiculo.getPlaca()) != null) {
            System.out.println("⚠️ Error: El vehículo con la placa " + vehiculo.getPlaca() + " ya está registrado.");
        } else {
            vehiculos.add(vehiculo);
            System.out.println("🚗 Vehículo registrado: " + vehiculo.getPlaca());
        }
    }

    // Registrar salida y retornar el costo
    public double registrarSalida(String placa) {
        Vehiculo vehiculo = buscarVehiculo(placa);
        if (vehiculo != null) {
            vehiculos.remove(vehiculo);
            double costo = calcularCosto(vehiculo);
            System.out.println("🚪 Vehículo salido: " + vehiculo.getPlaca() + " | Costo: $" + costo);
            return costo;
        } else {
            System.out.println("⚠️ Vehículo no encontrado.");
            return 0;
        }
    }

    // Consultar estado actual del parqueadero
    public List<Vehiculo> consultarEstado() {
        return vehiculos;
    }

    // Buscar vehículo por placa
    private Vehiculo buscarVehiculo(String placa) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }

    // Calcular costo según tipo de vehículo y tiempo de estadía
    private double calcularCosto(Vehiculo vehiculo) {
        // Lógica básica para calcular el costo (ejemplo con tarifas fijas)
        double tarifaBase = 0;

        if (vehiculo instanceof Automovil) tarifaBase = 2000;
        else if (vehiculo instanceof Motocicleta) tarifaBase = 1000;
        else if (vehiculo instanceof Camion) tarifaBase = 5000;

        // En esta versión, asumimos 1 hora mínima
        return tarifaBase;
    }
}