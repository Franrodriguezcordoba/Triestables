package State;

import semaforo.Semaforo;
import semaforo.Type;

public class GreenState extends State {
	
	

	GreenState(Semaforo semaforo) {
		super(semaforo);
	}

	@Override
	// Apartado A
	public State abrir() {
		return this;
	}

	@Override
	public State cerrar() {
		// Apartado B, en el caso de que sea Biestable cambiará a rojo, y si es
		// triestable a amarillo
		if (semaforo.getType().equals(b)) {
			// Apartado A
			RedState change = new RedState(semaforo);
			return change;
			// Apartado B
		} else {

			YellowState change1 = new YellowState(semaforo);
			return change1;
		}
	}

	// Apartado C
	public State cambio() {
		// Si el semaforo es biestable cambiará a triestable y viceversa
		// Además pasará a un nuevo estado que hemos creado de transicion, para que tras
		// el mensaje cambio() necesite otro mensaje
		// de abrir() o cerrar() para cambiar a otro estado de un tipo de semáforo
		// diferente
		
			return new TransicionState(semaforo);
		

	}

	public String estado() {
		return "abierto";
	}

}
