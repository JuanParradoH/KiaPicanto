package vehiculos;

public abstract class Vehiculo {
    protected String descripcion = "Vehiculo desconocido";
  
    public String getDescripcion() {
        return descripcion;
    }
  
    public abstract double costo();
}