package enemigos;

public class Analista extends Enemigo{

	public Analista(int cons, int fuer, int dest, int def, int rest) {
		super(cons, fuer, dest, def, rest);
		super.nombre="Analista";
	}

}
