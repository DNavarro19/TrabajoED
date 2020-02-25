package enemigos;

import personajes.Personaje;

/**
 * Clase Jabali, enemigo del piso 1
 * 
 * @author Ivan
 * 
 */
public class Jabali extends Enemigo{

	/**
	 * Metodo constructor, en el que se le anade el nombre
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 * @param res valor que define la cantidad de habilidades posibles a usar
	 */
	public Jabali(int cons, int fuer, int dest, int def, int rest) {
		super(cons, fuer, dest, def, rest);
		super.nombre="Jabali";
		}
	
	/**
	 * Ataque del jabali, realiza dos ataques basicos a dos personajes diferentes
	 * @param p el primer personaje target
	 * @param p2  el segundo personaje target
	 */
	public void ataqueJabali(Personaje p, Personaje p2) {
		super.ataqueBasico(p);
		super.ataqueBasico(p2);
	}

}
