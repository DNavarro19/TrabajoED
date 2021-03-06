package personajes;

import objetos.Objeto;

/**
 * Clase abstracta Personaje
 * 
 * @author David
 *
 */
public abstract class Personaje {
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

	/**
	 * @param cons Valor de la constitucion
	 * @param fuer Valor de la fuerza
	 * @param dest Valor de la destreza
	 * @param def  Valor de la defensa
	 * @param rest Valor de la resistencia
	 * 
	 *             Por defecto se estableceran estos atributos:
	 *             <ul>
	 *             <li>Vida actual sera igual a la constitucion</li>
	 *             <li>Resistencia actual sera igual a la resistencia</li>
	 *             <li>Defensa extra sera 0 por defecto</li>
	 *             <li>Fuerza extra sera 0 por defecto</li>
	 *             <li>Aturdido sera falso por defecto</li>
	 *             <li>Esquiva sera falso por defecto</li>
	 *             </ul>
	 */
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
	 * @return Devuelve el valor de la esquiva del personaje
	 */
	public boolean isEsquiva() {
		return esquiva;
	}

	/**
	 * Este metodo resta una cantidad de dano a la vida actual del personaje
	 * teniendo en cuenta la defensa de este
	 * 
	 * @param ataque Cantidad de dano que va a recibir el personaje
	 * 
	 */
	public void recibeDano(int ataque) {
		vidaActual -= (ataque - ataque * (defensa + defensaExtra) / 100);
	}

	/**
	 * Este metodo anade una cantidad de vida a la vida actual del personaje
	 * 
	 * @param cura Cantidad de vida que se va a recibir el personaje
	 */
	public void recibeVida(int cura) {
		vidaActual += cura;
		if (vidaActual > constitucion) {
			vidaActual = constitucion;
		}
	}

	/**
	 * @return Devuelve el valor de la constitucion que tiene el personaje
	 */
	public int getConstitucion() {
		return constitucion;
	}

	/**
	 * Resetea el valor de la defensa y fuerza extra a 0
	 */
	public void reset() {
		defensaExtra = 0;
		fuerzaExtra = 0;
	}

	/**
	 * @param fuerzaExtra Cambia el valor de fuerza extra
	 */
	public void setFuerzaExtra(int fuerzaExtra) {
		this.fuerzaExtra = fuerzaExtra;
	}

	/**
	 * @param defensaExtra Cambia el valor de defensa extra
	 */
	public void setDefensaExtra(int defensaExtra) {
		this.defensaExtra = defensaExtra;
	}

	/**
	 * @return Devuelve el valor de la fuerza que tiene el personaje
	 */
	public int getFuerza() {
		return fuerza;
	}

	/**
	 * @return Devuelve el valor de la destreza que tiene el personaje
	 */
	public int getDestreza() {
		return destreza;
	}

	/**
	 * @return Devuelve el valor de la defensa que tiene el personaje
	 */
	public int getDefensa() {
		return defensa;
	}

	/**
	 * @return Devuelve el valor de la resistencia que tiene el personaje
	 */
	public int getResistencia() {
		return resistencia;
	}

	/**
	 * @return Devuelve el valor de la vida actual que tiene el personaje
	 */
	public int getVidaActual() {
		return vidaActual;
	}

	/**
	 * @return Devuelve los objetos que tiene equipados el personaje
	 */
	public Objeto[] getObjetos() {
		return objetos;
	}

	/**
	 * @return Devuelve el valor de la primera posicion libre del array de objetos
	 *         del personaje
	 */
	public int getPriPosLib() {
		return priPosLib;
	}

	/**
	 * @return Devuelve el valor de la defensa extra que tiene el personaje
	 */
	public int getDefensaExtra() {
		return defensaExtra;
	}

	/**
	 * @return Devuelve el valor de la fuerza extra que tiene el personaje
	 */
	public int getFuerzaExtra() {
		return fuerzaExtra;
	}

	/**
	 * <ul>
	 * <li>Equipa el objeto en un array</li>
	 * <li>No lo equipa porque el array esta lleno</li>
	 * </ul>
	 * 
	 * @param tipo El objeto que usa el personaje
	 * 
	 */
	public void equipaObjeto(Objeto obj) {
		if (priPosLib < objetos.length) {
			usaObjeto(obj);
			objetos[priPosLib] = obj;
			priPosLib++;
		} else {
			System.out.println("Ya no puedes equiparte mas objetos");
		}
	}

	/**
	 * Metodo que modifica los atributos del personaje segun el objeto a utilizar
	 * 
	 * @param obj El objeto a usar
	 */
	public void usaObjeto(Objeto obj) {
		switch (obj.getCaracteristica()) {
		case CONSTITUCION:
			constitucion += obj.getPuntos();
			break;
		case DEFENSA:
			defensa += obj.getPuntos();
			break;
		case DESTREZA:
			destreza += obj.getPuntos();
			break;
		case FUERZA:
			fuerza += obj.getPuntos();
			break;
		case RESISTENCIA:
			resistencia += obj.getPuntos();
			break;
		default:
			break;
		}
	}

	/**
	 * @param constitucion Cantidad de constitucion a anadir
	 */
	public void anadeConstitucion(int constitucion) {
		this.constitucion += constitucion;
	}

	/**
	 * @param aturdido Cambia el valor de aturdido
	 */
	public void setAturdido(boolean aturdido) {
		this.aturdido = aturdido;
	}

	/**
	 * @param esquiva Cambia el valor de esquiva
	 */
	public void setEsquiva(boolean esquiva) {
		this.esquiva = esquiva;
	}

	/**
	 * @param fuerza Cantidad de fuerza a anadir
	 */
	public void anadeFuerza(int fuerza) {
		this.fuerza += fuerza;
	}

	/**
	 * 
	 * @param destreza Cantidad de destreza a anadir
	 */

	public void anadeDestreza(int destreza) {
		this.destreza += destreza;
	}

	/**
	 * 
	 * @param defensa Cantidad de defensa a anadir
	 */
	public void anadeDefensa(int defensa) {
		this.defensa += defensa;
	}

	/**
	 * 
	 * @param resistencia Cantidad de resistencia a anadir
	 */

	public void anadeResistencia(int resistencia) {
		this.resistencia += resistencia;
	}

	/**
	 * Muestra los ataques del personaje, los cuales se declaran en las clases hijas
	 */
	public abstract void muestraAtaque();

	/**
	 * @return Devuelve el valor de aturdido que tiene el personaje
	 */
	public boolean isAturdido() {
		return aturdido;
	}

}
