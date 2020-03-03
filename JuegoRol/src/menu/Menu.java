package menu;

import personajes.Personaje;
import logica.Logica;

public class Menu {
	public Menu(){
		
	}
	/*
	public void muestraOpcionesAtaque(Personaje p) {
		for (int i = 0; i < p.habilidades.length; i++) {
			System.out.println(i+")"+p.habilidades[i]);
		}
	}*/
	/**
	 * metodo que muestra una opcion u otra en funcion del numero generado por el metodo generaSituacion()
	 */
	
	public void muestraOpcion() {
		Logica l=new Logica();
		switch(l.generaSituacion()) {
		case "ataque":
			//muestraOpcionesAtaque();
			break;
		case "tesoro":
			opcionesTesoro();
			break;
		case "trampa":
			System.out.println("HAS CAIDO EN UNA TRAMPA!(pierdes X puntos de vida)");
			break;
		case "vida":
			System.out.println("HAS ENCONTRADO UNA SALA DE VIDA(restauras tus puntos de saud)");
			break;
		case "tesoro+combate":
			//en proceso
			break;
		}
	}
	public void opcionesSala() {
		System.out.println("1)siguiente sala");
		System.out.println("2)mostrar vida");
	}
	public void opcionesTesoro() {
		System.out.println("4)abrir tesoro");
	}
		
	public void eligeObjeto() {
		System.out.println("1)amuleto");
		System.out.println("2)anillo");
		System.out.println("3)collar");
		System.out.println("4)[MOSTRAR DETALLES DE LOS OBJETOS]");
	}
	
}
