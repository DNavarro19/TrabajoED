package personajes;

import objetos.Objeto;

public class Personaje {
	private int constitucion;
	private int fuerza;
	private int destreza;
	private int defensa;
	private int resistencia;
	private int vidaActual;
	private Objeto[] objetos = new Objeto[5];
	private int priPosLib;

	public Personaje(int cons, int fuer, int dest, int def, int rest) {
		constitucion = cons;
		fuerza = fuer;
		destreza = dest;
		defensa = def;
		resistencia = rest;
		vidaActual = constitucion;
	}

	public void recibeDano(int ataque) {
		vidaActual -= (ataque - ataque * defensa / 100);
	}

	public void equipaObjeto(Objeto item) {
		if (priPosLib < objetos.length) {
			objetos[priPosLib] = item;
			priPosLib++;
		} else {
			System.out.println("Ya no puedes equiparte mas objetos");
		}
	}

}
