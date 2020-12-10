package ejercicio16;

public class mago extends personajes {
		//Atributos
		
		protected String poder;
		
		//Constructor que inicializa el poder
		
		public mago(String pod) {
			super("Ataquerayo", 100);
			this.poder = pod;
		}
		//Método encantar
		
		public String Encantar(int gasto) {
			this.nivelenergia = this.nivelenergia - gasto;
			return "El mago "+ nombre+ " ha usado sus encantamientos y se ha quedado con "+ nivelenergia+ " puntos de energía";
		}
		//Métodos
		
		public String getPoder() {
			return poder;
		}
		
		public void setPoder(String poder) {
			this.poder = poder;
		}
		
	}


