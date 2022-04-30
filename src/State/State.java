package State;

import semaforo.Semaforo;
import semaforo.Type;

public abstract class State {
   // Apartado A
	Semaforo semaforo;
	Type b = Type.Biestable;
	Type t = Type.Triestable;
	
	State(Semaforo biestable){
		this.semaforo=biestable;
		}
	
	public abstract State abrir();
	public abstract String estado();
	public abstract State cerrar();
	
	//Apartado C
	public abstract State cambio();
	
	
}
