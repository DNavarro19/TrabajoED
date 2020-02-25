package personajes;

import enemigos.Enemigo;

public class Cazador extends Personaje {
	private String[] habilidades = { "Disparo con arco", "Puñalada", "Esquivar", "Disparo multiple" };

	public Cazador() {
		super(50, 50, 50, 50, 50);
	}

	public void disparoArco(Enemigo ene) {
		int dano = 50 + 50 * fuerza / 100;
		ene.recibeDano(dano);
	}

	public void puñalada(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

	public void esquivar(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

	public void disparoMultiple(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

}
