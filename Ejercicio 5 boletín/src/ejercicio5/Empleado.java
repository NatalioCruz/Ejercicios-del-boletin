package ejercicio5;

public class Empleado {
	
		//Atributos
	
		private long nDNI;
		private double sueldoBruto;
		private double sueldoNeto;
		private double sueldo;
		private double pagoHE;
		private int horasExtra;
		private double IRPF;
		private boolean casado;
		private int hijos;
		
		//Constructores
		
		public Empleado(double sueldo, double pagoHE, int horasExtra, double IRPF, boolean casado, int hijos) {
			this.casado=casado;
			this.hijos=hijos;
			this.horasExtra=horasExtra;
			this.IRPF=IRPF;
			this.pagoHE=pagoHE;
			this.sueldo=sueldo;
			this.nDNI=0;
		}
		
		public Empleado(long nDNI, double sueldo, double pagoHE, int horasExtra, double IRPF, boolean casado, int hijos) {
			this.casado=casado;
			this.hijos=hijos;
			this.horasExtra=horasExtra;
			this.IRPF=IRPF;
			this.pagoHE=pagoHE;
			this.sueldo=sueldo;
			this.nDNI=nDNI;
		}
		//M�todos

		public long getnDNI() {
			return nDNI;
		}

		public void setnDNI(long nDNI) {
			this.nDNI = nDNI;
		}

		public double getSueldo() {
			return sueldo;
		}

		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}

		public double getPagoHE() {
			return pagoHE;
		}

		public void setPagoHE(double pagoHE) {
			this.pagoHE = pagoHE;
		}

		public int getHorasExtra() {
			return horasExtra;
		}

		public void setHorasExtra(int horasExtra) {
			this.horasExtra = horasExtra;
		}

		public double getIRPF() {
			return IRPF;
		}

		public void setIRPF(double iRPF) {
			IRPF = iRPF;
		}

		public boolean isCasado() {
			return casado;
		}

		public void setCasado(boolean casado) {
			this.casado = casado;
		}

		public int getHijos() {
			return hijos;
		}

		public void setHijos(int hijos) {
			this.hijos = hijos;
		}
		public void calculoHorasExtra() {
			System.out.println("El pago por las horas extras mensuales es de "+(horasExtra*pagoHE)+"�");
		}
		public void sueldoBruto() {
			System.out.println("El sueldo bruto es de "+((horasExtra*pagoHE)+sueldo)+"�");
			sueldoBruto=((horasExtra*pagoHE)+sueldo);
		}
		public void calculoIRPF() {
			if(casado=true) {
			System.out.println("Se le quitar�a un total de "+sueldoBruto*(((IRPF/100)*2)*hijos)+"� por el IRPF");
			sueldoNeto=(sueldoBruto-(sueldoBruto*(((IRPF/100)*2)*hijos)));
			}else {
				System.out.println("Se le quitar�a un total de "+sueldoBruto*((IRPF/100)*hijos)+"� por el IRPF");
				sueldoNeto=(sueldoBruto-(sueldoBruto*((IRPF/100)*hijos)));
			}
		
		}
		public void println() {
			System.out.println("DNI: "+nDNI+" Casad@: "+casado+" N�mero de hijos: "+hijos);
		}
		public void printAll() {
			if(casado=true) {
			System.out.println("DNI: "+nDNI+" Casad@: "+casado+" N�mero de hijos: "+hijos);
			System.out.println("Sueldo base: "+sueldo+" Sueldo bruto: "+sueldoBruto+" Sueldo neto (IRPF): "+sueldoNeto+" pago por horas extra: "+(horasExtra*pagoHE)+" retenci�n por IRPF: "+sueldoBruto*(((IRPF/100)*2)*hijos));
			}else {
				System.out.println("DNI: "+nDNI+" Casad@: "+casado+" N�mero de hijos: "+hijos);
				System.out.println("Sueldo base: "+sueldo+" Sueldo bruto: "+sueldoBruto+" Sueldo neto (IRPF): "+sueldoNeto+" pago por horas extra: "+(horasExtra*pagoHE)+" retenci�n por IRPF: "+sueldoBruto*((IRPF/100)*hijos));
			}
		}
		

		
		


}

