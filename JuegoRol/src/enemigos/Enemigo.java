package enemigos;


public class Enemigo {
	private int constitucion;
	private int vidaActual;
	private int fuerza;
	private int destreza;
	private int defensa;
	private int resistencia;
	
	public Enemigo() {
		vidaActual=constitucion;
	}
	
	public void recibeDano(int ataque) {
		vidaActual-=(ataque-ataque*defensa/100);
	}
}
