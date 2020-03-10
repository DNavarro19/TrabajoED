package personajes;

import enemigos.Enemigo;

public class Cazador extends Personaje {
	private String[] habilidades = { "Disparo con arco", "Punalada", "Esquivar", "Disparo multiple" };

	public Cazador() {
		super(50, 50, 50, 50, 50);
	}

	public void disparoArco(Enemigo ene) {
		int dano = 50 + 50 * fuerza / 100;
		ene.recibeDano(dano);
	}

	public void punalada(Enemigo ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano * 2);
	}

	public void esquivar() {
		esquiva = true;
	}

	public void disparoMultiple(Enemigo ene, Enemigo ene2) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
		ene2.recibeDano(dano);
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
