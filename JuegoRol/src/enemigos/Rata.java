package enemigos;

import personajes.Personaje;

/**
 * Clase Rata, enemigo del piso 1
 * 
 * @author Ivan
 * 
 */
public class Rata extends Enemigo{

	/**
	 * Metodo constructor, en el que se le anade el nombre
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 */
	public Rata(int cons, int fuer, int dest, int def) {
		super(cons, fuer, dest, def);
		super.nombre="Rata";
	}

	/**
	 * Ataque mordisco, hara el doble de dano basico normal
	 * @param p el personaje target
	 */
	public void ataqueRata(Personaje p) {
		int dano=50+50*(fuerza + fuerzaExtra)/50;
		p.recibeDano(dano);
	}
}
