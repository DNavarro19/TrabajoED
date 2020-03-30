package menu;

import personajes.Personaje;

/**
 * 
 * @author Pablo Meca Sanchez
 *
 */
public class Menu {
	public Menu() {
		// Contructor vacío ya que esta clase no tiene atributos
	}

	/**
	 * método que muestra las opciones de la sala
	 */

	public void opcionesSala() {
		System.out.print("\n1)siguiente sala\n2)mostrar vida");
	}

	/**
	 * método que muestra las opciones del tesoro
	 */
	public void opcionesTesoro() {
		System.out.print("\n4)abrir tesoro");
	}

	/**
	 * método que muestra los objetos a elegir
	 */
	public void eligeObjeto() {
		System.out.print("1)amuleto\n" + "2)anillo\n" + "3)collar\n" + "4)[MOSTRAR DETALLES DE LOS OBJETOS]");
	}

	/**
	 * método que muestra los diferentes ataques disponible
	 */
	public void opcionesCombate(Personaje p) {
		p.muestraAtaque();
	}

}
