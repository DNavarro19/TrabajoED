package personajes;

import enemigos.Enemigo;

public class Monje extends Personaje {
	private String[] habilidades = { "Golpe con vara", "Posicion de defensa", "Combo Ken", "Cabezazo" };

	public Monje() {
		super(50, 50, 50, 50, 50);
	}

	public void golpeVara(Enemigo ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
	}

	public void posicionDefensa() {
		esquiva = true;
	}

	public void comboKen(Enemigo ene, Enemigo ene2) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
		ene2.recibeDano(dano);
	}

	public void cabezazo(Enemigo ene) {
		ene.setAturdido(true);
	}
	/**
	 * metodo que muestra por pantalla los ataques del personajes
	 */
	public void muestraAtaque() {
		for (int i = 0; i < habilidades.length; i++) {
			System.out.println(i+")"+habilidades[i]);
		}
	}

}
