package ejercicio10;

public class Restaurante {
	 
	private int chocos, papas, totalChocos, totalPapas;
	private static int clientes;
	public Restaurante(int papas, int chocos) {
		this.chocos = chocos;
		this.papas = papas;
		Restaurante.clientes = 0;
	}
	
	public void addChocos(int chocos) {
		chocos = chocos*1000;
		this.chocos = chocos;
		
	}
	public void addPapas(int papas) {
		papas = papas*1000;
		this.papas = papas;
	}
	
	
	public void getComensales() {
		if(papas<1000 || chocos<500) {
			System.out.println("No hay suficientes Papas o Chocos");
		}else {
		while(papas>=1000 && chocos>=500) {
			papas = papas - 1000;
			chocos =chocos - 500;
			clientes += 3;			
			}
		}
		System.out.println("Puede atender a "+clientes+" personas");
		
	}
	public void showChocos() {
		System.out.println("Hay un total de "+(chocos / 1000)+" kilos de chocos");
	}

	public void showPapas() {
		System.out.println("Hay un total de "+(papas / 1000)+" kilos de papas");
	}
	
}

