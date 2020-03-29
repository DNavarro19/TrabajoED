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

	public int getConstitucion() {
		return constitucion;
	}

	protected int vidaActual;
	protected int fuerzaExtra;
	protected int defensaExtra;
	protected boolean aturdido;

	/**
	 * Metodo constructor
	 * 
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno
	 * @param def  valor que reduce la cantidad de dano recibido
	 */
	public Enemigo(int cons, int fuer, int dest, int def) {
		constitucion = cons;
		fuerza = fuer;
		destreza = dest;
		defensa = def;
		vidaActual = constitucion;
		fuerzaExtra = 0;
		defensaExtra = 0;
		aturdido = false;
	}

	/**
	 * Metodo que devuelve la fuerza del enemigo
	 * 
	 * @return valor numerico de la fuerza del enemigo
	 */
	public int getFuerza() {
		return fuerza;
	}

	/**
	 * Metodo que devuelve la fuerza extra del enemigo
	 * 
	 * @return valor numerico de la fuerza extra del enemigo
	 */
	public int getFuerzaExtra() {
		return fuerzaExtra;
	}

	/**
	 * Metodo que devuelve la vida actual del enemigo
	 * 
	 * @return el valor numerico de la vida actual del enemigo
	 */
	public int getVidaActual() {
		return vidaActual;
	}

	public boolean isAturdido() {
		return aturdido;
	}

	/**
	 * Metodo que devuelve la defensa del enemigo
	 * 
	 * @return el valor numerico de la defensa del enemigo
	 */
	public int getDefensa() {
		return defensa;
	}

	/**
	 * Metodo que devuelve la defensa bonus del enemigo
	 * 
	 * @return el valor numerico de la defensa bonus del enemigo
	 */
	public int getDefensaExtra() {
		return defensaExtra;
	}

	/**
	 * Metodo que da valor a la vida
	 * 
	 * @param vida la cantidad numerica de vida que va a tener el enemigo
	 */
	public void setVidaActual(int vida) {
		this.vidaActual = vida;
	}

	/**
	 * Metodo que da valor a la fuerza extra
	 * 
	 * @param vida la cantidad numerica de fuerza extra que va a tener el enemigo
	 */
	public void setFuerzaExtra(int fExtra) {
		this.fuerzaExtra = fExtra;
	}

	/**
	 * Metodo que da valor a la defensa extra
	 * 
	 * @param vida la cantidad numerica de defensa extra que va a tener el enemigo
	 */
	public void setDefensaExtra(int dExtra) {
		this.defensaExtra = dExtra;
	}

	/**
	 * Este metodo indica la cantidad numerica que va a restarse a la vida actual
	 * del enemigo
	 * 
	 * @param ataque cantidad de dano que va a recibir
	 * 
	 */
	public void recibeDano(int ataque) {
		vidaActual -= (ataque - ataque * (defensa + defensaExtra) / 100);
	}

	/**
	 * Metodo de ataque basico que tendran todos los enemigos ademas de uno extra
	 * 
	 * @param p se refiere al personaje elegido
	 */

	public void ataqueBasico(Personaje p) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		p.recibeDano(dano);
	}

	/**
	 * Metodo que permite curar a un enemigo teniendo en cuenta que no puede superar
	 * la vida base
	 * 
	 * @param cura cantidad que va a ser curado
	 */
	public void recibeVida(int cura) {
		vidaActual += cura;
		if (vidaActual > constitucion) {
			vidaActual = constitucion;
		}
	}

	/**
	 * Metodo que resetea los bonus a las caracteristicas cada turno
	 */
	public void reset() {
		fuerzaExtra = 0;
		defensaExtra = 0;
	}

	/**
	 * Metodo que permite aturdir a un enemigo
	 * 
	 * @param aturdido parametro en el que se establecera el boolean aturdido
	 */
	public void setAturdido(boolean aturdido) {
		this.aturdido = aturdido;
	}
}
