package enemigos;

import personajes.Personaje;

/**
 * Clase Fantasma, enemigo del piso 3
 * 
 * @author Ivan
 * 
 */
public class Fantasma extends Enemigo{

	/**
	 * Metodo constructor, en el que se le anade el nombre
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 */
	public Fantasma(int cons, int fuer, int dest, int def) {
		super(cons, fuer, dest, def);
		super.nombre="Fantasma";
	}
	/**
	 * Metodo de ataque del fantasma en el que hace dano a todos los personajes
	 * @param pjs el array de todos los personajes a los que va a atacar
	 */
	public void ataqueFantasma(Personaje [] pjs) {
		int dano = 60+60*(fuerza + fuerzaExtra)/100;
		for (int i = 0; i < pjs.length; i++) {
			pjs[i].recibeDano(dano);
		}
	}

}
