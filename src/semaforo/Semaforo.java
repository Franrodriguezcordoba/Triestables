package semaforo;
import State.*;


public class Semaforo {
	//Apartado A
	private State estado ;
	//Apartado B
	private Type tipo;
	
   // En el apartado A se creaba el objeto semáforo sin ningún parámetro, pero para
   // el apartado B se le añade el parámetro Type t, para definir de que tipo es el semáforo
	public Semaforo(Type t) {
		this.estado= new RedState(this);
		tipo=t;
		
		}
	// Este método permite que en los diferentes estados se actúe de manera diferente segun el tipo de semáforo
	public Type getType() {
		return tipo;
		
	}
	// Para el apartado C, si el semáforo recibe el mensaje cambio(), este deberá cambiar de tipo
	public void setType(Type b) {
		tipo=b;
		
	}
	//Apartado A
		public void abrir() {
			estado=estado.abrir();
			
		}
		public void cerrar() {
			estado=estado.cerrar();
			
		}
		
		public String estado() {
			return estado.estado();
			
		}
	
	// Apartado C
	public void cambio() {
		estado=estado.cambio();
	}
	
	
	
	

}
