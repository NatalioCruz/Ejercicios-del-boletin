package ejercicio16;

public class mainpersonajes {
	
	public static void main(String[] args) {
		guerreros g = new guerreros("Espada");
		mago m = new mago("Trueno");
		
		//M�todo combatir nos devuelve una descripci�n del guerrero
		
		System.out.println(""+g.Combatir(1900));
		
		
		g.Alimentarse(900);
		
		//M�todo encantar nos devuelve una descripci�n del mago
		
		System.out.println(""+m.Encantar(2));
		
	}
}
