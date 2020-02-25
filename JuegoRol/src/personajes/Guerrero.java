package personajes;

import enemigos.Enemigo;

public class Guerrero extends Personaje {
	private String[] habilidades = { "Espadazo", "Estocada", "Alzar Escudo", "Carga" };

	public Guerrero() {
		super(50, 50, 50, 50, 50);
	}

	public void espadazo(Enemigo ene) {
		int dano = 50 + 50 * fuerza / 100;
		ene.recibeDano(dano);
	}

	public void estocada(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

	public void alzarEscudo(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

	public void carga(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

}
