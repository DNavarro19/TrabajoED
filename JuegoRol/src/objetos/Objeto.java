package objetos;

import personajes.Personaje;

public class Objeto  {
	private String tipo;
	public Objeto(String tipo) {
		this.tipo=tipo;
	}
	/**
	 * 
	 * @param tipos el tipo de objeto que se quiere usar
	 * @param p El personaje al que se le aplica el objeto
	 */
	public void usaObjeto(String tipos,Personaje p) {
		switch (tipos) {
		case "amuleto":
			p.setCostitucion(70);
			break;
		case "anillo":
			p.setCostitucion(40);
			break;
		case "collar":
			p.setCostitucion(14);
		default:
			break;
		}
	}
	//metodo que 
	public void muestraObjeto() {
		System.out.println(this.tipo);
	}
	
}
