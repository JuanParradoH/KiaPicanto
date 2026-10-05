package cliente;

import vehiculos.Vehiculo;
import vehiculos.GTLineAT;
import vehiculos.VibrantMT;
import accesorios.MallaCarga;
import accesorios.KitBotonEncendido;
import accesorios.SensorParqueo;

public class ConcesionarioKia {
    public static void main(String args[]) {
        Vehiculo vehiculo1 = new VibrantMT();
        System.out.println(vehiculo1.getDescripcion() + " $" + vehiculo1.costo());

        Vehiculo vehiculo2 = new GTLineAT();
        vehiculo2 = new SensorParqueo(vehiculo2);
        vehiculo2 = new KitBotonEncendido(vehiculo2);
        vehiculo2 = new MallaCarga(vehiculo2);
        
        System.out.println(vehiculo2.getDescripcion() + " $" + vehiculo2.costo());
    }
}