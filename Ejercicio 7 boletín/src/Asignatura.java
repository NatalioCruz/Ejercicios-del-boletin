
public class Asignatura {
	private String nombreAsignatura;
	   private double calificacionAsignatura;
	   
	   public Asignatura(String nombreAsignatura, double calificacionAsignatura){
	       this.nombreAsignatura=nombreAsignatura;
	       this.calificacionAsignatura=calificacionAsignatura;
	   }
	   
	   public void setNota(double nuevaCalificacion){
	       calificacionAsignatura=nuevaCalificacion;
	   }
	   
	   public double getCalificacion(){
	       
	       return calificacionAsignatura;
	   }
	   
	   public String indicaAprobacion(){
	           if(calificacionAsignatura>=5)return "Aprobado";
	           else return "Reprobado";  }
	   
	   public String getNombreAsignatura(){
	       return nombreAsignatura;
	   }
	   
	}
	class PruebaAsignatura{
	   
	    public static void main(String [] arg){
	        Asignatura materia=new Asignatura("Matematicas", 6);
	        System.out.println("Tú calificación en la materia: "+ materia.getNombreAsignatura()+" Es "+materia.getCalificacion()+"\ny por lo tanto estás "+ materia.indicaAprobacion());
	       
	       
	       
	    }
	}

