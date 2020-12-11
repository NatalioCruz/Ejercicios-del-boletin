package ejercicio6;

import java.util.Scanner;

public class persona {
Scanner sc = new Scanner(System.in);
	
	private String nombre, apellidos;
	
	protected String dni;
	
	private int edad;
	
	persona(String nombre,String apellidos, String dni, int edad) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.edad=edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void cargarDatos(){
		System.out.println("Introduce tu nombre:");
		this.nombre = sc.next();
		System.out.println("Introduce tus apellidos:");
		this.apellidos = sc.next();
		System.out.println("Introduce tu DNI:");
		this.dni = sc.next();
		System.out.println("Introduce tu edad:");
		this.edad = sc.nextInt();
	}
	
	public void imprimirDatos() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellidos: " + this.apellidos);
		System.out.println("DNI: " + this.dni);
		System.out.println("Edad: " + this.edad);
	}
}

