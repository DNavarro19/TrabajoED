package objetos;

public class Objeto {
	private String tipo;
	private String caracteristica;
	private int puntos;

	/**
	 * @param tipo   El tipo de objeto que es
	 * @param caract Caracteristica a aumentar
	 * 
	 *               Los puntos se inicializan dependiendo del tipo de objeto que es
	 */
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
			break;
		default:
			break;
		}
	}

	/**
	 * @return Devuelve los puntos que se van a añadir a x caracteristica
	 */
	public int getPuntos() {
		return puntos;
	}

	/**
	 * @return Devuelve la caracteristica que va a ser aumentada
	 */
	public String getCaracteristica() {
		return caracteristica;
	}

	/**
	 * Metodo que muestra los atributos que cambia cada objeto
	 */
	public String describeObjetos() {
		return tipo + " aumenta en " + puntos + " puntos la " + caracteristica;
	}

}
