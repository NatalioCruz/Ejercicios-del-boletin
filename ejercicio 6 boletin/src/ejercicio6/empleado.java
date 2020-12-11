package ejercicio6;

public class empleado extends persona {
	
	private double sueldo;

	empleado(String nombre,String apellidos, String dni, int edad, double sueldo) {
		super(nombre, apellidos, dni, edad);
		this.sueldo=sueldo;
		
	}
	
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void cargarSueldo(){
		System.out.println("Introduce tu sueldo:");
		this.sueldo = sc.nextDouble();
	}
	
	public void imprimirSueldo() {
		System.out.println("Sueldo: " + this.sueldo);
	}
}

