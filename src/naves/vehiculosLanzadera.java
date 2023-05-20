package naves;

import naves.nave;

//--------------------------CLASE-VEHICULO-DE-LANZADERA-----------------------------------------------------------------------------


public class vehiculosLanzadera implements nave {
    private String propulsor;

    public vehiculosLanzadera(double peso, double capacidad, double velocidadMaxima, String propulsor) {
        super();
        this.propulsor = propulsor;
    }

    public String getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(String propulsor) {
        this.propulsor = propulsor;
    }

    @Override
    public void despegar() {
        System.out.println("El vehiculo de lanzadera está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El vehiculo de lanzadera está aterrizando.");
    }
}