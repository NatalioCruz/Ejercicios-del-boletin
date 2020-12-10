package ejercicio14;

public class Marciano {
	private boolean vivo = false;
	private String nombre;
	private static int numMarcianos;
	
	//Constructor
	
	public Marciano() {
	
	}
	
	//Constructor para el nombre del marciano y diferentes funciones
	
	public Marciano(String nombre) {
		this.vivo=true;
		this.nombre=nombre;
		numMarcianos++;
		nace();
	}
	
	//Método nace
	
	public void nace() {
		System.out.println("Hola, he nacido y soy el marciano" +nombre);
	}
	
	//Método muere
	
	public void muere() {
		if(vivo) {
			vivo=false;
			numMarcianos--;
			System.out.println("El marciano"+nombre+"ha muerto.");
		} else {
			System.out.println("El marciano"+nombre+"ya está muerto.");
		}
	}
	
	//Método estavivo
	
	public void estavivo() {
		if(vivo) {
			System.out.println("El marciano"+nombre+"está vivo.");
		} else {
			System.out.println("El marciano"+nombre+"está muerto.");
		}
	}
	
	//Método cueentamarcianos
	
	public void cuentamarcianos() {
		System.out.println("En este momento hay"+numMarcianos+"marciano/s vivo/s");
	}

}
