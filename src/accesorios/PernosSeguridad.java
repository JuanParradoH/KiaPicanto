package accesorios;
import vehiculos.Vehiculo;

public class PernosSeguridad extends AccesorioDecorator {
    private final Vehiculo vehiculo;

    public PernosSeguridad(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String getDescripcion() {
        return vehiculo.getDescripcion() + ", Pernos de seguridad STARLOCK";
    }

    @Override
    public double costo() {
        return 156100.0 + vehiculo.costo();
    }
}