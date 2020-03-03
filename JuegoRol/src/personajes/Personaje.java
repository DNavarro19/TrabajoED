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
	protected Objeto[] objetos = new Objeto[5];
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
	 * @param ataque cantidad de dano que va a recibir
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
		return objetos;
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
	public void equipaObjeto(Objeto obj, Personaje p) {
		if (priPosLib < objetos.length) {
			usaObjeto(obj);
			objetos[priPosLib] = obj;
			priPosLib++;
		} else {
			System.out.println("Ya no puedes equiparte mas objetos");
		}
	}

	/**
	 * metodo que modifica los atributos del personaje segun el objeto a utilizar
	 * 
	 * @param tipos el tipo de objeto que se quiere usar
	 * @param p     El personaje al que se le aplica el objeto
	 */
	public void usaObjeto(Objeto obj) {
		switch (obj.getCaracteristica()) {
		case "constitucion":
			constitucion += obj.getPuntos();
			break;
		case "defensa":
			defensa += obj.getPuntos();
			break;
		case "destreza":
			destreza += obj.getPuntos();
			break;
		case "fuerza":
			fuerza += obj.getPuntos();
			break;
		case "resistencia":
			resistencia += obj.getPuntos();
			break;
		default:
			break;
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
