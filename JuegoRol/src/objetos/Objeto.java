package objetos;

import personajes.Personaje;

public class Objeto {
	private String tipo;

	public Objeto(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * metodo que modifica los atributos del personaje segun el objeto a utilizar
	 * 
	 * @param tipos el tipo de objeto que se quiere usar
	 * @param p     El personaje al que se le aplica el objeto
	 */
	public void usaObjeto(String tipos, Personaje p) {
		switch (tipos) {
		case "amuleto":
			p.setConstitucion(70);
			// anadir la cantidad deseada al atributo deseado
			break;
		case "anillo":
			p.setConstitucion(40);
			// anadir la cantidad deseada al atributo deseado
			break;
		case "collar":
			p.setConstitucion(14);
			// anadir la cantidad deseada al atributo deseado
		default:
			break;
		}
	}

	/**
	 * metodo que muestra el tipo de objeto
	 */
	public void muestraObjeto() {
		System.out.println(this.tipo);
	}

	/**
	 * metodo que muestra los atributos que cambia cada objeto
	 */
	public void describeObjetos() {
		System.out.println("Amuleto:\n>aumenta el atributo en X puntos.\n>disminuye el atributo en X puntos");
		System.out.println("Collar:\n>aumenta el atributo en X puntos.\n>disminuye el atributo en X puntos");
		System.out.println("Anillo:\n>aumenta el atributo en X puntos.\n>disminuye el atributo en X puntos");
	}

}
