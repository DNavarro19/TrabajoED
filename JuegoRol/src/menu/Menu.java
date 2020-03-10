package menu;

import personajes.Personaje;
import logica.Logica;

public class Menu {
	public Menu(){
		
	}
	/**
	 * método que muestra las opciones de la sala
	 */
	
	public void opcionesSala() {
		System.out.println("1)siguiente sala");
		System.out.println("2)mostrar vida");
	}
	/**
	 * método que muestra las opciones del tesoro
	 */
	public void opcionesTesoro() {
		System.out.println("4)abrir tesoro");
	}
	/**
	 *método que muestra los objetos a elegir	
	 */
	public void eligeObjeto() {
		System.out.println("1)amuleto");
		System.out.println("2)anillo");
		System.out.println("3)collar");
		System.out.println("4)[MOSTRAR DETALLES DE LOS OBJETOS]");
	}
	/**
	 * método que muestra los diferentes ataques disponible
	 */
	public void opcionesCombate() {
	
	}
	
}
