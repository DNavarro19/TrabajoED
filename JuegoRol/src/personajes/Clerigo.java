package personajes;

import enemigos.Enemigo;

/**
 * Clase Clerigo
 * 
 * @author David
 *
 */
public class Clerigo extends Personaje {
	private String[] habilidades = { "Ataque con baston", "Ola de Sanacion", "Mano Bendita", "Cura Mayor" };

	public Clerigo() {
		super(50, 50, 50, 50, 50);
	}

	/**
	 * Metodo que golpea a un enemigo
	 * 
	 * @param ene Enemigo al que va dirigido el ataque
	 */
	public void ataqueBaston(Enemigo ene) {
		int dano = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		ene.recibeDano(dano);
	}

	/**
	 * Metodo que cura a todos los personajes
	 * 
	 * @param p El array de personajes que estan en juego
	 */
	public void olaSanacion(Personaje[] p) {
		int cura = 25 + 25 * (fuerza + fuerzaExtra) / 100;
		for (int i = 0; i < p.length; i++) {
			p[i].recibeVida(cura);
		}
	}

	/**
	 * Metodo que aumenta la fuerza de un personaje temporalmente
	 * 
	 * @param p Personaje al que va dirigido la habilidad
	 */
	public void manoBendita(Personaje p) {
		p.fuerzaExtra = 25;
	}

	/**
	 * Metodo que cura a un personaje
	 * 
	 * @param p Personaje al que va dirigido la habilidad
	 */
	public void curaMayor(Personaje p) {
		int cura = 50 + 50 * (fuerza + fuerzaExtra) / 100;
		p.recibeVida(cura);
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
