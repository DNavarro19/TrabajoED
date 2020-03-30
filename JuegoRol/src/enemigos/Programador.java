package enemigos;

/**
 * Clase Programador, enemigo del piso 5
 * 
 * @author Ivan
 * 
 */
public class Programador extends Enemigo{

	/**
	 * Metodo constructor, en el que se le anade el nombre
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 */
	public Programador(int cons, int fuer, int dest, int def) {
		super(cons, fuer, dest, def);
		super.nombre="Programador";
		}

	/**
	 * Metodo en el que el Programador aumenta la defensa de todos los enemigos
	 * @param en el array de enemigos target
	 */
	public void ataqueProgramador(Enemigo [] en) {
		for (int i = 0; i < en.length; i++) {
			en[i].defensaExtra+=30;
		}
	}
}
