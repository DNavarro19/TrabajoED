package personajes;

import objetos.Objeto;

public class Personaje {
	private int constitucion;
	private int fuerza;
	private int destreza;
	private int defensa;
	private int resistencia;
	private int vidaActual;
	private Objeto[] Objetos = new Objeto[5];
	private int priPosLib;

	public Personaje(int cons, int fuer, int dest, int def, int rest) {
		constitucion = cons;
		fuerza = fuer;
		destreza = dest;
		defensa = def;
		resistencia = rest;
		vidaActual = constitucion;
	}

	public void recibeDano(int ataque) {
		vidaActual -= (ataque - ataque * defensa / 100);
	}

	/**
	 * 
	 * @param item el objeto que usa el pesonajes
	 * @param p    el personaje que usa el objeto
	 * @return equipa el objeto en un array o no lo equipa porque el array esta
	 *         lleno
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
	 * @param cantidad la cantidad de constitucion a añadir
	 */
	public void setCostitucion(int cantidad) {
		this.constitucion += cantidad;
	}
	/**
	 * 
	 * @param fuerza la cantidad de fuerza a añadir
	 */

	public void setFuerza(int fuerza) {
		this.fuerza += fuerza;
	}
	/**
	 * 
	 * @param destreza la cantidad de destreza a añadir
	 */

	public void setDestreza(int destreza) {
		this.destreza += destreza;
	}
	/**
	 * 
	 * @param defensa la cantidad de defensa a añadir
	 */
	public void setDefensa(int defensa) {
		this.defensa += defensa;
	}
	/**
	 * 
	 * @param resistencia la cantidad de resistencia a añadir
	 */

	public void setResistencia(int resistencia) {
		this.resistencia += resistencia;
	}

}
