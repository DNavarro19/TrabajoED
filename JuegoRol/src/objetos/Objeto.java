package objetos;

import personajes.Personaje;

public class Objeto {
	private String tipo;
	private String caracteristica;
	private int puntos;

	public Objeto(String tipo, String caract) {
		this.tipo = tipo;
		this.caracteristica = caract;
		switch (tipo) {
		case "amuleto":
			puntos = 70;
			break;
		case "anillo":
			puntos = 40;
			break;
		case "collar":
			puntos = 20;
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

	public int getPuntos() {
		return puntos;
	}

	public String getCaracteristica() {
		return caracteristica;
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
