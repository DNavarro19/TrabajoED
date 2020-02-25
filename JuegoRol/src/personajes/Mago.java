package personajes;

import enemigos.Enemigo;

public class Mago extends Personaje {
	private String[] habilidades = { "Hechizo", "Bola de fuego", "Nova", "Rafaga Arcana" };

	public Mago() {
		super(50, 50, 50, 50, 50);
	}

	public void hechizo(Enemigo ene) {
		int dano = 50 + 50 * fuerza / 100;
		ene.recibeDano(dano);
	}

	public void bolaFuego(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

	public void nova(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

	public void rafagaArcana(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

}
