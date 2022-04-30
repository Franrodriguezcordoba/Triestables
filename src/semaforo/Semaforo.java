package semaforo;
import State.*;


public class Semaforo {
	//Apartado A
	private State estado ;
	//Apartado B
	private Type tipo;
	
   // En el apartado A se creaba el objeto sem�foro sin ning�n par�metro, pero para
   // el apartado B se le a�ade el par�metro Type t, para definir de que tipo es el sem�foro
	public Semaforo(Type t) {
		this.estado= new RedState(this);
		tipo=t;
		
		}
	// Este m�todo permite que en los diferentes estados se act�e de manera diferente segun el tipo de sem�foro
	public Type getType() {
		return tipo;
		
	}
	// Para el apartado C, si el sem�foro recibe el mensaje cambio(), este deber� cambiar de tipo
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
