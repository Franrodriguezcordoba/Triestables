package State;

import semaforo.Semaforo;
import semaforo.Type;

public class RedState extends State {
	

	public RedState(Semaforo semaforo) {
		super(semaforo);

	}

	@Override

	public State abrir() {
		// Apartado B, en el caso de que sea Biestable cambiará a verde, y si es
		// triestable a amarillo
		if (semaforo.getType().equals(b)) {
			// Apartado A
			GreenState change = new GreenState(semaforo);
			return change;
			// Apartado B
		} else {
			YellowState change1 = new YellowState(semaforo);
			return change1;
		}

	}

	// Apartado C
	public State cambio() {
		
		
			return new TransicionState(semaforo);

		}
	

	@Override
	// Apartado A
	public State cerrar() {
		return this;
	}

	// Apartado A
	public String estado() {
		return "cerrado";
	}

}
