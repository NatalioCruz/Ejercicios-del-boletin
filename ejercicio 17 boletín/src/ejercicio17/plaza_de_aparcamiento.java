package ejercicio17;

import java.util.Scanner;

public class plaza_de_aparcamiento {
	
	Scanner sc = new Scanner(System.in);
	
	private int numplaza;
	private coche coche;
	private boolean plaza;
	private static int numcoches;
	
	public plaza_de_aparcamiento() {

	}
	
	
	public plaza_de_aparcamiento(coche coche) {
		
		this.numplaza=1;
		this.coche=coche;
		this.plaza=true;
		this.numcoches=0;
	}
	
	
	public void menu() {
		System.out.println("plaza aparcamiento"
				+"\n1. Aparcar coche"
				+"\n2. Sacar coche"
				+"\n3. Ver coche aparcado"
				+"\n4. Salir aplicacion");
		
	}
	
	
	public void aparcar() {
		if(plaza) {
			
			System.out.println("Introduce la matricula del coche");
			coche.setmatricula(sc.next());
			
			System.out.println("Introduzca la marca del coche");
			coche.setmarca(sc.next());
			
			System.out.println("Introduzca el modelo del coche");
			coche.setmodelo(sc.next());
			
			plaza=false;
					
			numcoches++;
			
			System.out.println("El coche se ha aparcado");
			
		} else {
			System.out.println("Plaza ya ocupada por otro coche");
		}
	}
	
	public void desocupar_plaza() {
		if(plaza) {
			System.out.println("Plaza libre, el coche ha salido de la plaza");
			plaza=true;
		} else {
			System.out.println("Error, no hay coche en la palza de aparcamiento. La plaza está libre");
		}
	}
	
	public void estado_plaza() {
		
		System.out.println("La plaza está libre (true) u ocupada (false):" + plaza);
		System.out.println("Información del coche: " +coche.toString());
		System.out.println("Ha o Han aparcado en esta plaza " + numcoches+ "coche o coches");
	}
}	
