package menu;

import personajes.Personaje;
/**
 * 
 * @author Pablo Meca Sanchez
 *
 */
public class Menu {
	public Menu(){
		//Contructor vac�o ya que esta clase no tiene atributos
	}
	/**
	 * m�todo que muestra las opciones de la sala
	 */
	
	public void opcionesSala() {
		System.out.println("1)siguiente sala");
		System.out.println("2)mostrar vida");
	}
	/**
	 * m�todo que muestra las opciones del tesoro
	 */
	public void opcionesTesoro() {
		System.out.println("4)abrir tesoro");
	}
	/**
	 *m�todo que muestra los objetos a elegir	
	 */
	public void eligeObjeto() {
		System.out.println("1)amuleto");
		System.out.println("2)anillo");
		System.out.println("3)collar");
		System.out.println("4)[MOSTRAR DETALLES DE LOS OBJETOS]");
	}
	/**
	 * m�todo que muestra los diferentes ataques disponible
	 */
	public void opcionesCombate(Personaje p) {
		p.muestraAtaque();
	}
	
}
