package Main;

import semaforo.*;

public class main {
	public static void main(String[] args) {
		Type biestable= Type.Biestable;
		Type triestable=Type.Triestable;
		// Creamos un semaforo biestable
		Semaforo s = new Semaforo(biestable);
		
		// Vemos si su estado inicial es "cerrado"
		System.out.println(s.estado());
		// Cambiamos a un dispositivo triestable
		s.cambio();
		//Observamos que a�n no se haya hecho el cambio, ya que 
		//tiene que recibir abrir() o cerrar()
		System.out.println(s.getType());
		// Ahora si le mandamos el mensaje abrir()
		s.abrir();
		//Deber�a devolver estado= precaucion y type=Triestable
		System.out.println(s.estado());
		System.out.println(s.getType());
		//Volvemos a hacer el cambio y no deber�a devolver a�n el tipo= Biestable
		s.cambio();
		System.out.println(s.getType());
		// Tras abrilo deber�a devolver Biestable y abierto como estado
		s.abrir();
		System.out.println(s.estado());
		System.out.println(s.getType());
		//Cambiamos, mensaje abrir() para estado precauci�n y 
		//abrir() otra vez para estado abierto
		s.cambio();
		s.abrir();
		s.abrir();
		System.out.println(s.estado());
		System.out.println(s.getType());
		//Cambiamos otra vez
		s.cambio();
		System.out.println(s.estado());
		System.out.println(s.getType());
		//Al cerrar deber�a salir como resultado, cerrado y biestable
		s.cerrar();
		System.out.println(s.estado());
		System.out.println(s.getType());
		
		
		
		
		
		
		
	}
}
