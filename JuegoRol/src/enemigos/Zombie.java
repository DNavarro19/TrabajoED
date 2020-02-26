package enemigos;

/**
 * Clase Zombie, enemigo del piso 3
 * 
 * @author Ivan
 * 
 */
public class Zombie extends Enemigo{

	/**
	 * Metodo constructor, en el que se le anade el nombre
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 * @param res valor que define la cantidad de habilidades posibles a usar
	 */
	public Zombie(int cons, int fuer, int dest, int def) {
		super(cons, fuer, dest, def);
		super.nombre="Zombie";
		}
	/**
	 * Metodo en el que el zombie se sube la defensa
	 */
	public void ataqueZombie() {
		super.defensaExtra+=35;
	}

}
