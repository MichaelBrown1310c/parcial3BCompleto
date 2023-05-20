package naves;

import naves.nave;

//Clase concreta: TransbordadorEspacial
public class naveTripulada implements nave {
 private double peso;
 private double capacidad;
 private double velocidadMaxima;
 private int numAstronautas;

 public naveTripulada(double peso, double capacidad, double velocidadMaxima, int numAstronautas) {
     this.peso = peso;
     this.capacidad = capacidad;
     this.velocidadMaxima = velocidadMaxima;
     this.numAstronautas = numAstronautas;
 }

 @Override
 public void despegar() {
     System.out.println("La nave espacial tripulada despego.");
 }

 @Override
 public void aterrizar() {
     System.out.println("La nave espacial tripulada aterrizo.");
 }
}