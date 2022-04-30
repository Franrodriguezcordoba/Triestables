package State;

import semaforo.Semaforo;
//Apartado B
public class YellowState extends State {

	YellowState(Semaforo semaforo) {
		super(semaforo);

	}

	@Override
	public State abrir() {
		GreenState change = new GreenState(semaforo);
		return change;

	}

	@Override
	public State cerrar() {
		RedState change = new RedState(semaforo);
		return change;

	}

	public String estado() {
		return "precaución";
	}

	public State cambio() {
		

		return new TransicionState(semaforo);
	}

}
