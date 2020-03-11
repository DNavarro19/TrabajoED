package personajes;

import enemigos.Enemigo;

public class Monje extends Personaje {
	private String[] habilidades = { "Golpe con vara", "Posicion de defensa", "Combo Ken", "Cabezazo" };

	public Monje() {
		super(50, 50, 50, 50, 50);
	}

	/**
	 * Metodo que golpea a un enemigo
	 * 
	 * @param ene Enemigo al que va dirigido el ataque
	 */
	public void golpeVara(Enemigo ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
	}

	/**
	 * Metodo que establece la esquiva a true, y este personaje esquivará el
	 * siguiente ataque
	 */
	public void posicionDefensa() {
		esquiva = true;
	}

	/**
	 * Metodo que golpea a dos enemigos a la vez
	 * 
	 * @param ene  Enemigo al que va dirigido el ataque
	 * @param ene2 Enemigo al que va dirigido el ataque
	 */
	public void comboKen(Enemigo ene, Enemigo ene2) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
		ene2.recibeDano(dano);
	}

	/**
	 * Metodo que aturde a un enemigo
	 * 
	 * @param ene Enemigo al que va dirigido el ataque
	 */
	public void cabezazo(Enemigo ene) {
		ene.setAturdido(true);
	}

	/**
	 * Metodo que muestra por pantalla los ataques del personajes
	 */
	@Override
	public void muestraAtaque() {
		for (int i = 0; i < habilidades.length; i++) {
			System.out.println(i + ")" + habilidades[i]);
		}
	}

}
