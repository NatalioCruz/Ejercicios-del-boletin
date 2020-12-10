package ejercicio14;

import java.util.Scanner;

public class marte {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Marciano[] marcianos = new Marciano[4];
		System.out.println("Nacen tres marcianos");
		
		for(int i=0; i<3; i++) {
			System.out.println("Introduce el nombre");
			String nombre = sc.next();
			marcianos[i]=new Marciano(nombre);
		}
	
	
	marcianos[2].cuentamarcianos();
	
	marcianos[1].muere();
	
	System.out.println("nace un cuarto marciano");
	System.out.println("Introduce el nombre:");
	String nombre = sc.next();
	marcianos[3]=new Marciano(nombre);
	marcianos[3].cuentamarcianos();
	marcianos[1].muere();
	
	for(int i=0; i<4; i++) {
		marcianos[i].estavivo();
	}

}
