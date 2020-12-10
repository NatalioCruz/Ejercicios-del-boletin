package ejercicio16;

public class guerreros extends personajes {
	
			//Atributos
			
			protected String arma;
			
			//Constructor
			//Tenemos que crear el constructor para el arma
			
			public guerreros(String arma) {
				super("Ataquerelampago", 67);
				this.arma = arma;
			}
			
			//Método Combatir
			
			public String Combatir(int energiagastada) {
				this.nivelenergia = this.nivelenergia - energiagastada;
				return "El guerrero "+nombre+" ha matado con su arma" + arma+ " y su nivel de energia se ha quedado en " + nivelenergia;
			}
			
			//Método para devolver un valor del arma
			
			public String getArma() {
				return arma;
			}
			
			public void setArma(String arma) {
				this.arma = arma;
			}
			
	}
