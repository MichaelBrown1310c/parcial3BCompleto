package naves;

import naves.nave;

//--------------------------CLASE-DE-NAVE-SATELITAL-----------------------------------------------------------------------------

public class naveTipoSatelite implements nave {
 private double peso;
 private double capacidad;
 private double velocidadMaxima;
 private String orbita;

 public naveTipoSatelite(double peso, double capacidad, double velocidadMaxima, String orbita) {
     this.peso = peso;
     this.capacidad = capacidad;
     this.velocidadMaxima = velocidadMaxima;
     this.orbita = orbita;
 }

 @Override
 public void despegar() {
     System.out.println("La nave espacial satelital despego.");
 }

 @Override
 public void aterrizar() {
     System.out.println("La nave espacial satelital aterrizo.");
 }
}
