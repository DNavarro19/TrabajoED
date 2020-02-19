package habilidades;

public class Habilidad {
	protected int dano;
	protected boolean aturde;
	protected int ignoraDefensa;
	protected int esquiva;
	protected int subeDefensa;
	protected boolean bloquea;

	public Habilidad() {

	}

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
