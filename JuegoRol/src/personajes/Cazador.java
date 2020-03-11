package personajes;

import enemigos.Enemigo;

public class Cazador extends Personaje {
	private String[] habilidades = { "Disparo con arco", "Punalada", "Esquivar", "Disparo multiple" };

	public Cazador() {
		super(50, 50, 50, 50, 50);
	}

	/**
	 * Metodo que golpea a un enemigo
	 * 
	 * @param ene Enemigo al que va dirigido el ataque
	 */
	public void disparoArco(Enemigo ene) {
		int dano = 50 + 50 * fuerza / 100;
		ene.recibeDano(dano);
	}

	/**
	 * Metodo que golpea a un enemigo haciendo siempre el doble de daño
	 * 
	 * @param ene Enemigo al que va dirigido el ataque
	 */
	public void punalada(Enemigo ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano * 2);
	}

	/**
	 * Metodo que establece la esquiva a true, y este personaje esquivará el
	 * siguiente ataque
	 */
	public void esquivar() {
		esquiva = true;
	}

	/**
	 * Metodo que golpea a dos enemigos a la vez
	 * 
	 * @param ene  Enemigo al que va dirigido el ataque
	 * @param ene2 Enemigo al que va dirigido el ataque
	 */
	public void disparoMultiple(Enemigo ene, Enemigo ene2) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
		ene2.recibeDano(dano);
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
