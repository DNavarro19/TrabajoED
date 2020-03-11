package objetos;

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

	public int getPuntos() {
		return puntos;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	/**
	 * metodo que muestra los atributos que cambia cada objeto
	 */
	public String describeObjetos() {
		return tipo + " aumenta en " + puntos + " puntos la " + caracteristica;
	}

}
