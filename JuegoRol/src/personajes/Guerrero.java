package personajes;

import enemigos.Enemigo;

public class Guerrero extends Personaje {
	private String[] habilidades = { "Espadazo", "Estocada", "Alzar Escudo", "Carga" };

	public Guerrero() {
		super(50, 50, 50, 50, 50);
	}

	public void espadazo(Enemigo ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
	}

	public void estocada(Enemigo ene, Enemigo ene2) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
		ene2.recibeDano(dano);
	}

	public void alzarEscudo(Enemigo ene) {
		defensaExtra = 50;
	}

	public void carga(Enemigo ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
		ene.setAturdido(true);
	}

}
