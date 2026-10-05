package accesorios;
import vehiculos.Vehiculo;

public class KitBotonEncendido extends AccesorioDecorator {
    private Vehiculo vehiculo;
    
    public KitBotonEncendido(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String getDescripcion() {
        return vehiculo.getDescripcion() + ", Kit boton encendido alarma 2 controles";
    }

    @Override
    public double costo() {
        return 1500000.0 + vehiculo.costo();
    }
}