package ejercicio5;

public class Test {
	
	public static void main(String[] args) {
		Empleado Pepe= new Empleado(47562710, 10000, 2000, 3, 5, true, 2);
		Pepe.calculoHorasExtra();
		Pepe.sueldoBruto();
		Pepe.calculoIRPF();
		Pepe.println();
		Pepe.printAll();


	}

}

