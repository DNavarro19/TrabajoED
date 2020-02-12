package personajes;

import objetos.Objeto;

public class Personaje {
	private int constitucion;
	private int vidaActual;
	private int fuerza;
	private int destreza;
	private int defensa;
	private int resistencia;
	private Objeto[] objetos=new Objeto[5];
	private int priPosLib;
	
	public Personaje() {
		vidaActual=constitucion;
	}
	
	public void recibeDano(int ataque) {
		vidaActual-=(ataque-ataque*defensa/100);
	}
	
	public void equipaObjeto(Objeto item) {
		objetos[priPosLib]=item;
		priPosLib++;
	}
	

	
	
	
}
