package enemigos;

import personajes.Personaje;

/**
 * Clase Huargen, enemigo del piso 4
 * 
 * @author Ivan
 * 
 */
public class Huargen extends Enemigo{

	/**
	 * Metodo constructor, en el que se le anade el nombre
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 * @param res valor que define la cantidad de habilidades posibles a usar
	 */
	public Huargen(int cons, int fuer, int dest, int def) {
		super(cons, fuer, dest, def);
		super.nombre="Huargen";
		}
	/**
	 * Ataque del huargen, hara el doble de dano basico normal
	 * @param p el personaje target
	 */
	public void ataqueHuargen(Personaje p) {
		int dano=80+80*(fuerza + fuerzaExtra)/50;
		p.recibeDano(dano);
	}
}
