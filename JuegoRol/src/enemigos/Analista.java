package enemigos;

import personajes.Personaje;

/**
 * Clase Analista, enemigo del piso 4
 * 
 * @author Ivan
 * 
 */
public class Analista extends Enemigo{

	/**
	 * Metodo constructor, en el que se le anade el nombre
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 * @param res valor que define la cantidad de habilidades posibles a usar
	 */
	public Analista(int cons, int fuer, int dest, int def) {
		super(cons, fuer, dest, def);
		super.nombre="Analista";
	}
	/**
	 * Metodo en el que el Analista aturde y hace dano a todos los personaje
	 * @param pjs el array de personajes target
	 */
	public void ataqueAnalista(Personaje [] pjs) {
		for (int i = 0; i < pjs.length; i++) {
			pjs[i].setAturdido(true);
			pjs[i].recibeDano(50+50*super.fuerza/100);
		}
	}

}
