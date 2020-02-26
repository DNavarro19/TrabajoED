package personajes;

import objetos.Objeto;

public class Personaje {
	protected int constitucion;
	protected int fuerza;
	protected int destreza;
	protected int defensa;
	protected int resistencia;
	protected int resistenciaActual;
	protected int vidaActual;
	protected int fuerzaExtra;
	protected int defensaExtra;
	protected boolean aturdido;
	protected boolean esquiva;
	protected Objeto[] Objetos = new Objeto[5];
	protected int priPosLib;

	public Personaje(int cons, int fuer, int dest, int def, int rest) {
		constitucion = cons;
		fuerza = fuer;
		destreza = dest;
		defensa = def;
		resistencia = rest;
		vidaActual = constitucion;
		resistenciaActual = resistencia;
		defensaExtra = 0;
		fuerzaExtra = 0;
		aturdido = false;
		esquiva = false;
	}

	/**
	 * Este metodo indica la cantidad numerica que va a restarse a la vida actual
	 * del personaje
	 * 
	 * @param ataque cantidad de dno que va a recibir
	 * 
	 */
	public void recibeDano(int ataque) {
		vidaActual -= (ataque - ataque * (defensa + defensaExtra) / 100);
	}

	public void recibeVida(int cura) {
		vidaActual += cura;
	}

	public int getConstitucion() {
		return constitucion;
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getDestreza() {
		return destreza;
	}

	public int getDefensa() {
		return defensa;
	}

	public int getResistencia() {
		return resistencia;
	}

	public int getVidaActual() {
		return vidaActual;
	}

	public Objeto[] getObjetos() {
		return Objetos;
	}

	public int getPriPosLib() {
		return priPosLib;
	}

	/**
	 * <ul>
	 * <li>equipa el objeto en un array</li>
	 * <li>no lo equipa porque el array esta lleno</li>
	 * </ul>
	 * 
	 * @param tipo el objeto que usa el personaje
	 * @param p    el personaje que usa el objeto
	 * 
	 * 
	 * 
	 */
	public void equipaObjeto(String tipo, Personaje p) {
		if (priPosLib < Objetos.length) {
			Objeto obj = new Objeto(tipo);
			obj.usaObjeto(tipo, p);
			Objetos[priPosLib] = obj;
			priPosLib++;
		} else {
			System.out.println("Ya no puedes equiparte mas objetos");
		}
	}

	/**
	 * 
	 * @param cantidad la cantidad de constitucion a anadir
	 */
	public void setConstitucion(int cantidad) {
		this.constitucion += cantidad;
	}

	public void setAturdido(boolean aturdido) {
		this.aturdido = aturdido;
	}

	public void setEsquiva(boolean esquiva) {
		this.esquiva = esquiva;
	}

	/**
	 * 
	 * @param fuerza la cantidad de fuerza a anadir
	 */

	public void setFuerza(int fuerza) {
		this.fuerza += fuerza;
	}

	/**
	 * 
	 * @param destreza la cantidad de destreza a anadir
	 */

	public void setDestreza(int destreza) {
		this.destreza += destreza;
	}

	/**
	 * 
	 * @param defensa la cantidad de defensa a anadir
	 */
	public void setDefensa(int defensa) {
		this.defensa += defensa;
	}

	/**
	 * 
	 * @param resistencia la cantidad de resistencia a anadir
	 */

	public void setResistencia(int resistencia) {
		this.resistencia += resistencia;
	}

}
