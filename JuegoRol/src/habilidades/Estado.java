package habilidades;

public class Estado extends Habilidad {

	public Estado(boolean bloquea) {
		super(bloquea);
	}

	public Estado(int subeDefensa) {
		super();
		super.subeDefensa = subeDefensa;
	}

}
