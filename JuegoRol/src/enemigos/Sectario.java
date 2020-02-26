package enemigos;

import personajes.Personaje;

/**
 * Clase Sectario, enemigo del piso 4
 * 
 * @author Ivan
 * 
 */
public class Sectario extends Enemigo{
	/**
	 * Metodo constructor, en el que se le anade el nombre
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 * @param res valor que define la cantidad de habilidades posibles a usar
	 */

	public Sectario(int cons, int fuer, int dest, int def) {
		super(cons, fuer, dest, def);
		super.nombre="Sectario";
		}

	public void ataqueSectario(Enemigo[] en) {
		int cura = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		for (int i = 0; i < en.length; i++) {
			en[i].recibeVida(cura);
		}
	}
}
