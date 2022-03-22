package test;

public class Auto {
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	
	
	static int cantidadCreados;
	
	
	
	int cantidadAsientos() {
		
		int cont = 0;
		for(int i = 0;i<this.asientos.length;i++) {
			if(this.asientos[i] instanceof Asiento) {
				cont+=1;
				
			}
			
		}
		return cont;
		
	}
	
	
	String verificarIntegridad(){
		int cont=0;
		for(int i = 0;i<this.asientos.length;i++) {
			int registro = this.registro;
			int registrom = this.motor.registro;
			int registroa = this.asientos[i].registro;
			
			
			if(registroa == registrom && registroa==registro) {
				cont+=1;
			}
			
			
		}
		
		if(cont==this.asientos.length) {
			return "Auto original";
		}
		
		else {
			return "Las piezas no son originales";
		}

		
	}
	
	
}
