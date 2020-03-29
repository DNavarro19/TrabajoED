package personajes;

import java.util.Random;

import enemigos.Enemigo;

/**
 * Clase Mago
 * 
 * @author David
 *
 */
public class Mago extends Personaje {
	private String[] habilidades = { "Hechizo", "Bola de fuego", "Nova", "Rafaga Arcana" };

	public Mago() {
		super(50, 50, 50, 50, 50);
	}

	/**
	 * Metodo que golpea a un enemigo
	 * 
	 * @param ene Enemigo al que va dirigido el ataque
	 */
	public void hechizo(Enemigo ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
	}

	/**
	 * Metodo que golpea a un enemigo haciendo mas daño de lo normal
	 * 
	 * @param ene Enemigo al que va dirigido el ataque
	 */
	public void bolaFuego(Enemigo ene) {
		int dano = 100 + 100 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
	}

	/**
	 * Metodo que golpea a todos los enemigos
	 * 
	 * @param ene Enemigos a los que va dirigido el ataque
	 */
	public void nova(Enemigo[] ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		for (int i = 0; i < ene.length; i++) {
			ene[i].recibeDano(dano);
		}
	}

	/**
	 * Metodo que golpea a un enemigo hasta 5 veces
	 * 
	 * @param ene Enemigo al que va dirigido el ataque
	 */
	public void rafagaArcana(Enemigo ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		Random r = new Random();
		int rnd = r.nextInt(4) + 1;
		for (int i = 0; i < rnd; i++) {
			ene.recibeDano(dano);
		}
	}

	/**
	 * Metodo que muestra por pantalla los ataques del personajes
	 */
	@Override
	public void muestraAtaque() {
		for (int i = 0; i < habilidades.length; i++) {
			System.out.println((i + 1) + ")" + habilidades[i]);
		}
	}
}
