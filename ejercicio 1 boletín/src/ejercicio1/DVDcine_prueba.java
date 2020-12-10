package ejercicio1;

import java.util.Scanner;

public class DVDcine_prueba {
	 public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);
	       
	        System.out.println("Nombre de la pelicula");
	        String nombre = sc.nextLine();
	        System.out.println("Nombre del autor");
	        String autor = sc.nextLine();
	        System.out.println("Resumen");
	        String resumen = sc.nextLine();
	        System.out.println("Genero");
	        String genero = sc.nextLine();
	        System.out.println("Duracion");
	        int duracion = sc.nextInt();
	       
	        DVDcine cine = new DVDcine(nombre, autor, resumen, genero, duracion);
	        System.out.println(cine.esThriller());
	        System.out.println(cine.muestraDuracion()); 
	        System.out.println(cine.tieneResumen());
	        System.out.println(cine.muestraDVDCine());
	    }

	}

