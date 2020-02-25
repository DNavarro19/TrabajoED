package personajes;

import enemigos.Enemigo;

public class Clerigo extends Personaje {
	private String[] habilidades = { "Ataque con baston", "Ola de Sanacion", "Mano bendita", "Cura Mayor" };

	public Clerigo() {
		super(50, 50, 50, 50, 50);
	}

	public void ataqueBaston(Enemigo ene) {
		int dano = 50 + 50 * fuerza / 100;
		ene.recibeDano(dano);
	}

	public void olaSanacion() {

	}

	public void manoBendita(Personaje p) {
		p.fuerzaExtra = 25;
	}

	public void curaMayor(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

}
