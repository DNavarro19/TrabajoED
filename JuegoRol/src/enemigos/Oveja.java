package enemigos;

/**
 * Clase Oveja, enemigo del piso 1
 * 
 * @author Ivan
 * 
 */
public class Oveja extends Enemigo{

	/**
	 * Metodo constructor, en el que se le anade el nombre
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 */
	public Oveja(int cons, int fuer, int dest, int def) {
		super(cons, fuer, dest, def);
		super.nombre="Oveja";
		}
	
	/**
	 * Habilidad de la oveja en la que cura a un enemigo
	 * @param en el enemigo al que va a curar
	 */
	public void ataqueOveja(Enemigo en) {
		en.recibeVida(60);
	}

}
