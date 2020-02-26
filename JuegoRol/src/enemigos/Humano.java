package enemigos;

/**
 * Clase Humano, enemigo del piso 2
 * 
 * @author Ivan
 * 
 */
public class Humano extends Enemigo{

	/**
	 * Metodo constructor, en el que se le anade el nombre
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 * @param res valor que define la cantidad de habilidades posibles a usar
	 */
	public Humano(int cons, int fuer, int dest, int def) {
		super(cons, fuer, dest, def);
		super.nombre="Humano";
		}

	/**
	 * Habilidad del humano en la que cura a un enemigo
	 * @param en el enemigo al que va a curar
	 */
	public void ataqueHumano(Enemigo en) {
		en.recibeVida(80);
	}
}
