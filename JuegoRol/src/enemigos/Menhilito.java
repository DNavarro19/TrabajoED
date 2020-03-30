package enemigos;

/**
 * Clase Menhilito, enemigo del piso 4	
 * 
 * @author Ivan
 * 
 */
public class Menhilito extends Enemigo{

	/**
	 * Metodo constructor, en el que se le anade el nombre
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 */
	public Menhilito(int cons, int fuer, int dest, int def) {
		super(cons, fuer, dest, def);
		super.nombre="Menhilito";
		}
	/**
	 * Metodo en el que el menhilito va a aumentar su defensa
	 */
	public void ataqueMenhilito() {
		super.defensaExtra+=50;
	}
}
