package personajes;

import enemigos.Enemigo;

public class Mago extends Personaje {
	private String[] habilidades = { "Hechizo", "Bola de fuego", "Nova", "Rafaga Arcana" };

	public Mago() {
		super(50, 50, 50, 50, 50);
	}

	public void hechizo(Enemigo ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
	}

	public void bolaFuego(Enemigo ene) {
		int dano = 100 + 100 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
	}

	public void nova(Enemigo[] ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		for (int i = 0; i < ene.length; i++) {
			ene[i].recibeDano(dano);
		}
	}

	public void rafagaArcana(Enemigo ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		int rnd = (int) (Math.random() * 5 + 1);
		for (int i = 0; i < rnd; i++) {
			ene.recibeDano(dano);
		}
	}
	/**
	 * metodo que muestra por pantalla los ataques del personajes
	 */
	@Override
	public void muestraAtaque() {
		for (int i = 0; i < habilidades.length; i++) {
			System.out.println(i+")"+habilidades[i]);
		}
	}
}
