package ejecutar;

import java.util.Scanner;

//-----------------IMPORTAR-CLASES-DE-LAS-NAVES-DEL-OTRO-PAQUETE--------------------------------------------------------------------------------------

import naves.vehiculosLanzadera;
import naves.naveNoTripulada;
import naves.nave;
import naves.naveTipoSatelite;
import naves.naveTripulada;

//----------------------DATOS-Y-VARIABLES-AQUI---------------------------------------------------------------------------------

public class main {
	private static final int MAX_NAVES = 9;
	private static nave[] inventario = new nave[MAX_NAVES];
	private static int contadorNaves = 0;
	// -------------------------------INDICADOR-DE-CLASE-MAIN------------------------------------------------------------------------
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean terminar = false;
		
		// -----------------------UTILIZE-ANSI-PARA-CAMBIAR-EL-COLOR-DE-LOS-PRINT--------------------------------------------------------------------------------
		
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_GREEN = "\u001B[32m";
		
		// -----------------------OPCIONES-EN-CONSOLA-PARA-EL-USUARIO--------------------------------------------------------------------------------
	
		while (!terminar) {

			System.out.println(ANSI_GREEN + "Escoge el tipo de nave que quiereas crear (selecciona el numero indicado para la opcion que quieras escoger)" + ANSI_RESET);
			System.out.println();
			System.out.println("Opcion 1. Satelital");
			System.out.println("Opcion 2. Vehiculo de lanzadera");
			System.out.println("Opcion 3. Nave tripulada");
			System.out.println("Opcion 4. Nave de transpote interplanetario");
			System.out.println("Opcion 5. Salir");

			int opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				crearSatelite();
				break;
			case 2:
				crearVehiculoLanzadera();
				break;
			case 3:
				crearNaveTripulada();
				break;
			case 4:
				crearNaveNoTripulada();
				break;
			case 5:
				terminar = true;
				break;
			default:
				System.out.println(
						"Opcion invalida. selecciona una opcion valida utilizando el numero correspondiente a la opcion deseada.");
				break;
			}
		}

		System.out.println("Programa finalizado.");
	
		// ----------------------OPCIONES-EN-CONSOLA-PARA-BUCAR-NAVES--------------------------------------------------------------------------------
		
		System.out.println();
		boolean fin = false;
		while (!fin) {
		System.out.println("Desea buscar alguna nave?");
		System.out.println("1. Si");
		System.out.println("2. No");

		int buscar = scanner.nextInt();

		if(buscar==1) {
		System.out.println("que nave desea buscar?");
		System.out.println("1. Nave espacial satelital");
		System.out.println("2. Vehiculo de lanzadera");
		System.out.println("3. Nave espacial tripulada");
		System.out.println("4. Nave espacial no tripulada");
		System.out.println("5. no deseo buscar naves, salir");
		System.out.println();
		int nave = scanner.nextInt();

		switch (nave) {
		case 1:
		buscarNave("naveTipoSatelite");
		break;

		case 2:
		buscarNave("vehiculosLanzadera");
		break;

		case 3:
		buscarNave("naveTripulada");
		break;

		case 4:
		buscarNave("naveNoTripulada");
		break;

		case 5:
		buscarNave(null);
		break;
		default:
		System.out.println("Opcion no encontrada");
		break;
		}
		}else if(buscar==2) {

		fin = true;

		}else {
		System.out.println("Opcion no encontrada");
		}
		}
	
	}

	// ---------------------------CREAR-UN-SATELITE----------------------------------------------------------------------------
	
	private static void crearSatelite() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el peso del satelite en (Kg):");
		double peso = scanner.nextDouble();

		System.out.println("Ingrese la capacidad del satlite en (Kg):");
		double capacidad = scanner.nextDouble();

		System.out.println("Ingrese la velocidad maxima del satelite en (Km/h):");
		double velocidadMaxima = scanner.nextDouble();

		System.out.println("Ingrese la orbita del sa1telite (planeta o trayectoria de la orbita):");
		String orbita = scanner.next();

		naveTipoSatelite satelite = new naveTipoSatelite(peso, capacidad, velocidadMaxima, orbita);
		agregarNave(satelite);
	}

	// --------------------------CREAR-UN-VEHICULO-DE-LANZADERA-----------------------------------------------------------------------------
	
	private static void crearVehiculoLanzadera() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el peso del vehiculo de lanzadera en (Kg):");
		double peso = scanner.nextDouble();

		System.out.println("Ingrese la capacidad de carga del vehiculo de lanzadera en (kg):");
		double capacidad = scanner.nextDouble();

		System.out.println("Ingrese la velocidad máxima del vehiculo de lanzadera en (Km/h):");
		double velocidadMaxima = scanner.nextDouble();

		System.out.println("Ingrese el propulsor del vehiculo de lanzadera (tipo de propulsor):");
		String propulsor = scanner.next();

		vehiculosLanzadera cohete = new vehiculosLanzadera(peso, capacidad, velocidadMaxima, propulsor);
		agregarNave(cohete);
	}
	// -------------------------CREAR-UNA-NAVE-TRIPULADA------------------------------------------------------------------------------

	private static void crearNaveTripulada() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el peso de la nave espacial tripulada (Kg):");
		double peso = scanner.nextDouble();

		System.out.println("Ingrese la capacidad de la nave espacial tripulada (Kg):");
		double capacidad = scanner.nextDouble();

		System.out.println("Ingrese la velocidad máxima de la nave espacial tripulada (km/h):");
		double velocidadMaxima = scanner.nextDouble();

		System.out.println("Ingrese el número de astronautas de la nave espacial tripulada:");
		int numAstronautas = scanner.nextInt();

		naveTripulada transbordador = new naveTripulada(peso, capacidad, velocidadMaxima, numAstronautas);
		agregarNave(transbordador);
	}

	// ----------------------------CREAR-NAVE-NO-TRIPULADA---------------------------------------------------------------------------
	private static void crearNaveNoTripulada() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el peso de la nave no tripulada (Kg):");
		double peso = scanner.nextDouble();

		System.out.println("Ingrese la capacidad de la nave no tripulada (kg):");
		double capacidad = scanner.nextDouble();

		System.out.println("Ingrese la velocidad máxima de la nave no tripulada (km/h):");
		double velocidadMaxima = scanner.nextDouble();

		System.out.println("Ingrese el sistema de propulsión de la nave no tripulada (tipo de propulsor):");
		String sistemaPropulsion = scanner.next();

		naveNoTripulada naveNoTripulada = new naveNoTripulada(peso, capacidad, velocidadMaxima, sistemaPropulsion);
		agregarNave(naveNoTripulada);
	}

	// --------------------------REGLA-PARA-CREAR-NAVES-----------------------------------------------------------------------------
	
	private static void agregarNave(nave nave) {
		if (contadorNaves < MAX_NAVES) {
			inventario[contadorNaves] = nave;
			contadorNaves++;
			System.out.println("Se agrego la nave al inventario.");
		} else {
			System.out.println("El inventario se encuentra lleno debido a que alcanzo el maximo de naves. No se puede agregar mas naves, si desea agregar mas naves reinicie el programa.");
		}
	}

	// -----------------------BUSCAR-LA-NAVE-GUARDADA--------------------------------------------------------------------------------
	
	public static void buscarNave(String tipoNave) {
		boolean encontrada = false;
		for (nave nave : inventario) {
			if (nave != null && nave.getClass().getSimpleName().equalsIgnoreCase(tipoNave)) {
				encontrada = true;
				System.out.println("Esta nave no se encuentra en el inventario: " + nave.getClass().getSimpleName());
				break;
			}
		}
		if (!encontrada) {
			System.out.println("Esta nave no se encuentra en el inventario.");
		}

	}


}


