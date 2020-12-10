package ejercicio13;

public class Alimento {
	
	boolean aux,origen;
	String nombre, vitaminas, minerales;
	int lipidos, hidratos, proteinas;
	
	Alimento(String nombre){
		this.nombre=nombre;
	}
	
	Alimento(String nombre, int lipidos, int hidratos, int proteinas, boolean origen, String vitaminas, String minerales){
		this.nombre=nombre;
		this.lipidos=lipidos;
		this.hidratos=hidratos;
		this.proteinas=proteinas;
		this.origen=origen;
		this.vitaminas=vitaminas;
		this.minerales=minerales;
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int getlipidos() {
		return lipidos;
	}
	
	public int setlipidos(int lipidos) {
		this.lipidos=lipidos;
	}
	
	public int hidratos() {
		return hidratos;
	}
	
	public int getproteinas() {
		return proteinas;
	}
	
	public void setproteinas(int proteinas) {
		this.proteinas=proteinas;
	}
	
	public boolean isorigen() {
		return origen;
	}
	
	public void setorigen(boolean origen) {
		this.origen=origen;
	}
	
	public String getvitaminas() {
		return vitaminas;
	}
	
	
	public void setvitaminas(String vitaminas) {
		this.vitaminas=vitaminas;
			if(vitaminas.equalsIgnoreCase("A")) {
				System.out.println("Tu contenido es alto");
			}else if(vitaminas.equalsIgnoreCase("B")) {
				System.out.println("Tu contenido es bajo");
			}else if(vitaminas.equalsIgnoreCase("M")) {
				System.out.println("Tu contenido es medio");
			}else {
				System.out.println("Tienes que introducir una de las letras A, B o M");
			}
	}
	
	public void setminerales(String minerales) {
		this.minerales=minerales;
		if(minerales.equalsIgnoreCase("A")) {
			System.out.println("Tu contenido es alto");
		
		}else if(minerales.equalsIgnoreCase("B")) {
			System.out.println("Tu contenido es bajo");
			
		}else if (minerales.equalsIgnoreCase("M")) {
			System.out.println("Tu contenido es medio");
			
		}else {
			System.out.println("Tienes que introducir una de las letras A, B o M");
		}
	}
	
	public String getminerales() {
		return minerales;
	}
	
	public void esdietetico() {
		if(this.lipidos<20 && this.vitaminas!="B") {
			
		}else if(this.lipidos>20 && this.vitaminas=="B") {
			aux=false;
		}
		
		System.out.println(aux);
	}
	
	public void muestraalimento() {
		System.out.println("lipidos"+lipidos+"%");
		System.out.println("hidratos"+hidratos+"%");
		System.out.println("proteinas"+proteinas+"%");
		System.out.println("¿Es de origen animal?"+origen);
		System.out.println("vitaminas:"+vitaminas);
		System.out.println("minerales"+minerales);
		System.out.println("¿Es dietetico?"+aux);
	}
}
