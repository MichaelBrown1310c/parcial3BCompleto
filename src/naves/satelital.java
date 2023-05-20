package naves;
//--------------------------CLASE-DE-NAVE-NO-TRIPULADA-SATELITAL-----------------------------------------------------------------------------

public class satelital implements nave {
 private double peso;
 private double capacidad;
 private double velocidadMaxima;
 private String orbita;

 public satelital(double peso, double capacidad, double velocidadMaxima, String orbita) {
     this.peso = peso;
     this.capacidad = capacidad;
     this.velocidadMaxima = velocidadMaxima;
     this.orbita = orbita;
 }

 @Override
 public void despegar() {
     System.out.println("La nave satelital despego.");
 }

 @Override
 public void aterrizar() {
     System.out.println("La nave satelital aterrizo.");
 }
}