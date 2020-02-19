package habilidades;

public class Ataque extends Habilidad {
	
	public Ataque(int dano) {
		super(dano);
	}

	public Ataque(int dano, boolean aturde) {
		super(dano, aturde);
	}

	public Ataque(int dano, int ignoraDefensa) {
		super(dano, ignoraDefensa);
	}
}
