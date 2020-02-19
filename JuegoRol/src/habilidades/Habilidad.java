package habilidades;

public class Habilidad {
	private int dano;
	private boolean aturde;
	private int ignoraDefensa;
	private int esquiva;
	private int subeDefensa;
	private boolean bloquea;

	public Habilidad(int dano) {
		this.dano = dano;
	}

	public Habilidad(int dano, boolean aturde) {
		this.dano = dano;
		this.aturde = aturde;
	}

	public Habilidad(int dano, int ignoraDefensa) {
		this.dano = dano;
		this.ignoraDefensa = ignoraDefensa;
	}

	public Habilidad(boolean bloquea) {
		this.bloquea = bloquea;
	}

}
