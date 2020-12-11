package ejercicio6;

public class main_persona {
	
public static void main(String[] args) {
		
		persona pers = new persona("Raúl","Martínez","12345678A", 18);
		empleado empl = new empleado("Juan","Delgado","87654321Z", 20, 1250);
		
		pers.imprimirDatos();
		
		empl.imprimirDatos();
		empl.imprimirSueldo();

	}

}

