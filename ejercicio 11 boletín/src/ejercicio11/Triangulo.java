package ejercicio11;

import java.util.Arrays;

public class Triangulo {
	private double long_lado1;
	private double long_lado2;
	private double long_lado3;
	
	public Triangulo(double long_lado1,double long_lado2,double long_lado3) { //Constructor el cual inicia los 3 lados de un triangulo
		this.long_lado1 = long_lado1;
		this.long_lado2 = long_lado2;
		this.long_lado3 = long_lado3;
	}
	public static boolean compareTo_Triangulos(Triangulo a, Triangulo b) { //Comparamos un triangulo con otro triangulo
	
		double[] ladosA = {a.long_lado1, a.long_lado2, a.long_lado3};
		double[] ladosB = {b.long_lado1, b.long_lado2, b.long_lado3}; 
		
		Arrays.sort(ladosA); //Ordena los lados 
		Arrays.sort(ladosB);
		return Arrays.equals(ladosA, ladosB); //Compara los lados
		
	}
	
	public static boolean compareTo_VTriangulos(Triangulo v[]) { //Recoge una cantidad de Triangulos introducidos y los compara
		for(int i=1;i < v.length;i++) { 
			if(!Triangulo.compareTo_Triangulos(v[0], v[i])) { //Compara si el primer triangulo es igual o diferente a los demas introducidos.
				return false;
			}
			
		}
		return true;
	}
	
	public int tipo_Triangulo() { //Compara los lados para saber si son todos iguales, 2 iguales 1 diferente o todos diferentes
		if(long_lado1 == long_lado2 && long_lado1==long_lado3) {
			return 1;
		} else if ((long_lado1 == long_lado2 || long_lado1 == long_lado3 || long_lado2 == long_lado3)
				&& (long_lado1!= long_lado2 || long_lado1!=long_lado3 || long_lado2!= long_lado3)) {
			return 2;
		}else {
			return 3;
		}
	}
}

