package enemigos;


/**
 * Clase Hobgoblin, enemigo del piso 2
 * 
 * @author Ivan
 * 
 */
public class Hobgoblin extends Enemigo{

	/**
	 * Metodo constructor, en el que se le anade el nombre
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 */
	public Hobgoblin(int cons, int fuer, int dest, int def) {
		super(cons, fuer, dest, def);
		super.nombre="Hobgoblin";
		}
	
	/**
	 * habilidad propia del hobgoblin en la que sube su ataque
	 * 
	 */
	public void ataqueHobgoblin() {
		super.fuerzaExtra=20;
	}
}
