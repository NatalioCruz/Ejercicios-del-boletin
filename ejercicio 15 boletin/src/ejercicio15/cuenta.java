package ejercicio15;

public class cuenta {
	
	private float saldo,saldo_inicial,retirar;
	private cuenta cuenta;
	
	public cuenta() { 
		saldo = 0;
		
	}


	public cuenta(float saldo_inic) { 
		this.saldo = saldo_inic;
		
	}
	
	
	public void ingresar(float saldo) { //Metodo que ingresa el dinero 

		this.saldo+= saldo;
	}
	public void extraer(float retirar) { //Metodo que retira el dinero
		if (retirar>saldo) {
			System.out.println("No hay dinero suficiente");
		}else {
			this.saldo-= retirar;
		}
	}
	public float getSaldo() {
		return saldo;
	}
	
}

