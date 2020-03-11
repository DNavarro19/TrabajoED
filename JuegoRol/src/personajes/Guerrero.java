package personajes;

import enemigos.Enemigo;

public class Guerrero extends Personaje {
	private String[] habilidades = { "Espadazo", "Estocada", "Alzar Escudo", "Carga" };

	public Guerrero() {
		super(50, 50, 50, 50, 50);
	}

	/**
	 * Metodo que golpea a un enemigo
	 * 
	 * @param ene Enemigo al que va dirigido el ataque
	 */
	public void espadazo(Enemigo ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
	}

	/**
	 * Metodo que golpea a dos enemigos a la vez
	 * 
	 * @param ene  Enemigo al que va dirigido el ataque
	 * @param ene2 Enemigo al que va dirigido el ataque
	 */
	public void estocada(Enemigo ene, Enemigo ene2) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
		ene2.recibeDano(dano);
	}

	/**
	 * Metodo que sube la defensa temporalmente de ese personaje
	 */
	public void alzarEscudo() {
		defensaExtra = 50;
	}

	/**
	 * Metodo que golpea a un enemigo y lo aturde
	 * 
	 * @param ene Enemigo al que va dirigido el ataque
	 */
	public void carga(Enemigo ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
		ene.setAturdido(true);
	}

	/**
	 * metodo que muestra por pantalla los ataques del personajes
	 */
	@Override
	public void muestraAtaque() {
		for (int i = 0; i < habilidades.length; i++) {
			System.out.println(i + ")" + habilidades[i]);
		}
	}

}
