package objetos;

import personajes.Personaje;

public class Objeto  {
	public static String[] tiposObjeto={"amuleto","anillo","collar"};
	/*private int boost1;
	private int boost2;
	private int boost3;
	private int bajada1;
	private int bajada2;
	private int bajada3;
	*/
	public Objeto() {
		
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
	
}
