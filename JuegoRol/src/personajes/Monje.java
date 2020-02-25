package personajes;

import enemigos.Enemigo;

public class Monje extends Personaje {
	private String[] habilidades = { "Golpe con vara", "Posicion de defensa", "Combo Ken", "Cabezazo" };

	public Monje() {
		super(50, 50, 50, 50, 50);
	}

	public void golpeVara(Enemigo ene) {
		int dano = 50 + 50 * fuerza / 100;
		ene.recibeDano(dano);
	}

	public void posicionDefensa() {

	}

	public void comboKen(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

	public void cabezazo(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

}
