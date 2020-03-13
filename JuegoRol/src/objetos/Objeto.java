package objetos;

public class Objeto {
	private Tipo tipo;
	private Caracteristica caracteristica;
	private int puntos;

	/**
	 * @param tipo   El tipo de objeto que es
	 * @param caract Caracteristica a aumentar
	 * 
	 *               Los puntos se inicializan dependiendo del tipo de objeto que es
	 */
	public Objeto(Tipo tipo, Caracteristica caract) {
		this.tipo = tipo;
		this.caracteristica = caract;
		switch (tipo) {
		case Amuleto:
			puntos = 70;
			break;
		case Anillo:
			puntos = 40;
			break;
		case Collar:
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
	public Caracteristica getCaracteristica() {
		return caracteristica;
	}

	/**
	 * Metodo que muestra los atributos que cambia cada objeto
	 */
	public String describeObjetos() {
		return tipo + " aumenta en " + puntos + " puntos la " + caracteristica;
	}

}
