package accesorios;
import vehiculos.Vehiculo;

public class MallaCarga extends AccesorioDecorator {
    private final Vehiculo vehiculo;

    public MallaCarga(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String getDescripcion() {
        return vehiculo.getDescripcion() + ", Malla de carga";
    }

    @Override
    public double costo() {
        return 110000.0 + vehiculo.costo();
    }
}