package ejercicio17;

import java.util.Scanner;

public class main_gestion_plaza {
	
	public static void main(String[] ars) {
		
		Scanner sc = new Scanner (System.in);
		
		coche c = new coche();
		
		plaza_de_aparcamiento p = new plaza_de_aparcamiento(c);
		
		int opcion;
		
		do {
			p.menu();
			opcion = sc.nextInt();
				switch (opcion) {
				
				case 1: p.aparcar(); break;
				case 2: p.desocupar_plaza(); break;
				case 3: p.estado_plaza(); break;
				default: System.err.println("Opción no válida");
				
				}
		} while(opcion!=4);
	}

}
