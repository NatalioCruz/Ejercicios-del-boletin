package ejercicio17;

public class coche {
	
	private String matrícula;
	private String marca;
	private String modelo;
	
	public coche() {
		
	}
	
	
	public coche(String matricula, String marca, String modelo) {
		
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
	}
	
	
	public String getmatricula() {
		return matricula;
	}
	
	
	public void setmatricula(String matricula) {
		this.matricula=matricula;
	}
	
	public String getmarca() {
		return marca;
	}
	
	public void setmarca(String marca) {
		this.marca=marca;
	}
	
	public String getmodelo() {
		return modelo;
	}

}
