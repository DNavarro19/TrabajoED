package enemigos;
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
	private int constitucion;
	private int fuerza;
	private int destreza;
	private int defensa;
	private int resistencia;
	private int vidaActual;
	
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
	

}
