package enemigos;


public class Enemigo {
	private int constitucion;
	private int fuerza;
	private int destreza;
	private int defensa;
	private int resistencia;
	private int vidaActual;
	
	public Enemigo(int cons, int fuer, int dest, int def, int rest) {
		constitucion = cons;
		fuerza = fuer;
		destreza = dest;
		defensa = def;
		resistencia = rest;
		vidaActual = constitucion;
	}
	
	public void recibeDano(int ataque) {
		vidaActual-=(ataque-ataque*defensa/100);
	}
}
