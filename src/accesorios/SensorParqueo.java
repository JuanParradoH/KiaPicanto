package accesorios;
import vehiculos.Vehiculo;

public class SensorParqueo extends AccesorioDecorator {
    private final Vehiculo vehiculo;

    public SensorParqueo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String getDescripcion() {
        return vehiculo.getDescripcion() + ", Sensor de parqueo";
    }

    @Override
    public double costo() {
        return 150000.0 + vehiculo.costo();
    }
}