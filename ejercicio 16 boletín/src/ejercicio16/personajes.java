package ejercicio16;

public class personajes {
	//Atributos
		
		protected String nombre;
		protected int nivelenergia;
		//Constructor
		
		public void Personajes(String nom, int nivel) {
			this.nombre = nom;
			this.nivelenergia = nivel;
		}
		//Método alimentarse
		
		public void Alimentarse(int nuevaenergia) {
			this.nivelenergia = this.nivelenergia + nuevaenergia;
		}
		//Métodos
		
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public int getNivelenergia() {
			return nivelenergia;
		}
		
		public void setNivelenergia(int nivelenergia) {
			this.nivelenergia = nivelenergia;
		}
		
	}

