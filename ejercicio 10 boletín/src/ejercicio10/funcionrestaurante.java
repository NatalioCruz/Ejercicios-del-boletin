package ejercicio10;

public class funcionrestaurante {
	
	public static void main(String[] args) {
		Restaurante r = new Restaurante(0, 0);
		r.addChocos(6); //Añade Chocos por Kgs
		r.addPapas(7); //Añade papas por kgs
		r.showChocos();
		r.showPapas();
		r.getComensales(); //Muestra la cantidad de personas que se pueden atenden
		/**
		 * Muestra la cantidad de chocos y de papas 
		 */
		r.showChocos();
		r.showPapas();
	}

}
