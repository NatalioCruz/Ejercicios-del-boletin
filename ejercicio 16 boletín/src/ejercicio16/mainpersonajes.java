package ejercicio16;

public class mainpersonajes {
	
	public static void main(String[] args) {
		guerreros g = new guerreros("Espada");
		mago m = new mago("Trueno");
		
		//Método combatir nos devuelve una descripción del guerrero
		
		System.out.println(""+g.Combatir(1900));
		
		
		g.Alimentarse(900);
		
		//Método encantar nos devuelve una descripción del mago
		
		System.out.println(""+m.Encantar(2));
		
	}
}
