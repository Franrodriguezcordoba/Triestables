package State;

import semaforo.Semaforo;
import semaforo.Type;
//Apartado C
public class TransicionState extends State{
	

	TransicionState(Semaforo semaforo) {
		super(semaforo);

	}
// El objeto una vez reciba el mensaje cambio() , esté en el estado que esté, pasará a un estado de transicion
// y hasta que no reciba el mensaje abrir() o cerrar() no cambiará finalmente de tipo de dispositivo
	
	@Override
	public State abrir() {
	
		if(semaforo.getType().equals(b)) {
			semaforo.setType(t);
			YellowState change = new YellowState(semaforo);
			return change;
		}
		else {
			semaforo.setType(b);
			return new GreenState(semaforo);
		}
		

	}

	

	@Override
	public State cerrar() {
		if(semaforo.getType().equals(b)) {
			semaforo.setType(t);
			YellowState change = new YellowState(semaforo);
			return change;
		}
		else {
			semaforo.setType(b);
			return new RedState(semaforo);
		}
		
	}

	@Override
	public String estado() {
		
		return "transicion";
	}

	public State cambio() {
		return this;
	}

}
