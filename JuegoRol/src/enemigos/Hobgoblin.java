package enemigos;

import personajes.Personaje;

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
	 * @param res valor que define la cantidad de habilidades posibles a usar
	 */
	public Hobgoblin(int cons, int fuer, int dest, int def, int rest) {
		super(cons, fuer, dest, def, rest);
		super.nombre="Hobgoblin";
		}
	
	public void ataqueHobgoblin(Personaje p) {
		
	}
}
