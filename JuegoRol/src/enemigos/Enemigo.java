package enemigos;

import personajes.Personaje;

/**
 * Clase enemigo, sera a lo que se enfrentaran los personajes en un combate
 * 
 * @author Ivan
 * 
 *  
 *
 */

public class Enemigo {
	protected String nombre;
	protected int constitucion;
	protected int fuerza;
	protected int destreza;
	protected int defensa;
	protected int resistencia;
	protected int vidaActual;
	
	/**
	 * Metodo constructor
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 * @param res valor que define la cantidad de habilidades posibles a usar
	 */
	public Enemigo(int cons, int fuer, int dest, int def, int res) {
		constitucion = cons;
		fuerza = fuer;
		destreza = dest;
		defensa = def;
		resistencia = res;
		vidaActual = constitucion;
	}
	/**
	 * Este metodo indica la cantidad numerica que va a restarse a la vida actual del enemigo
	 * 
	 * @param ataque cantidad de dano que va a recibir 
	 * 
	 */
	
	public void recibeDano(int ataque) {
		vidaActual-=(ataque-ataque*defensa/100);
	}
	
	/**
	 * Metodo de ataque basico que tendran todos los enemigos ademas de uno extra
	 * 
	 * @param p se refiere al personaje elegido
	 */
	
	public void ataqueBasico(Personaje p) {
		int dano=50+50*fuerza/100;
		p.recibeDano(dano);
	}
}
