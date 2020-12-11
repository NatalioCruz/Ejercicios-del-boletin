package ejercicio2;

import java.util.Scanner;

public class vehiculo {
	
Scanner sc = new Scanner(System.in);
	
	private String modelo;
	
		private double potencia=50;
		
		private boolean cRuedas=true;
		
		vehiculo (String b) {
			this.modelo=b;
		}

		public double getPotencia() {
			return potencia;
		}

		public void setPotencia(double potencia) {
			this.potencia = potencia;
		}

		public boolean iscRuedas() {
			return cRuedas;
		}

		public void setcRuedas(boolean cRuedas) {
			this.cRuedas = cRuedas;
		}
		
		public void imprimirDatos() {
			System.out.println("Modelo: " + this.modelo);
			System.out.println("Potencia: " + this.potencia); 
			System.out.println("¿Tiene tracción a 4 ruedas? " + iscRuedas());
												
		}
	}

 public class mainvehiculo {

	public static void main(String[] args) {
		
		vehiculo v = new vehiculo("Audi");
		
		v.imprimirDatos();

	}
	
 }



