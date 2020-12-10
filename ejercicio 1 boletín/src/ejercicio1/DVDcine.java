package ejercicio1;

public class DVDcine {
	
	private String nombre,autor,resumen,genero;
    private int duracion;

    public void DVDCine(String nombre, String autor, String resumen, String genero, int duracion) {

        this.nombre = nombre;
        this.autor = autor;
        this.resumen = resumen;
        this.genero = genero;
        this.duracion = duracion;
    }

    
    public boolean esThriller() {
        if(this.genero=="Thriller") {
            return true;
        }else {
        return false;
        }
    }
    
    public boolean tieneResumen() {

             return this.resumen!=null;
    }

    
    public int muestraDuracion() {
        return this.duracion;
    }
   
    public String muestraDVDCine() {
        return nombre+" cuyo actor es "+autor+ " del genero "+genero+" que trata sobre "+resumen+" y tiene un duracion de "+duracion;
    }


}


