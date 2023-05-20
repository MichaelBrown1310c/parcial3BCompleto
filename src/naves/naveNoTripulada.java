package naves;

import naves.nave;

//Clase concreta: NaveInterplanetaria
public class naveNoTripulada implements nave {
 private double peso;
 private double capacidad;
 private double velocidadMaxima;
 private String sistemaPropulsion;

 public  naveNoTripulada(double peso, double capacidad, double velocidadMaxima, String sistemaPropulsion) {
     this.peso = peso;
     this.capacidad = capacidad;
     this.velocidadMaxima = velocidadMaxima;
     this.sistemaPropulsion = sistemaPropulsion;
 }

 @Override
 public void despegar() {
     System.out.println("La nave esapcial no tripulada despego.");
 }

 @Override
 public void aterrizar() {
     System.out.println("La nave esapcial no tripulada aterrizo.");
 }
}