package personajes;

import enemigos.Enemigo;

public class Clerigo extends Personaje {
	private String[] habilidades = { "Ataque con baston", "Ola de Sanacion", "Mano bendita", "Cura Mayor" };

	public Clerigo() {
		super(50, 50, 50, 50, 50);
	}

	public void ataqueBaston(Enemigo ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
	}

	public void olaSanacion(Personaje[] p) {
		int cura = 25 + 25 * (fuerza + fuerzaExtra) / 100;
		for (int i = 0; i < p.length; i++) {
			p[i].recibeVida(cura);
		}
	}

	public void manoBendita(Personaje p) {
		p.fuerzaExtra = 25;
	}

	public void curaMayor(Personaje p) {
		int cura = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		p.recibeVida(cura);
	}

}
