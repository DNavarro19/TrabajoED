package personajes;

import enemigos.Enemigo;
import habilidades.Habilidad;

public class Monje extends Personaje {

	public Monje() {
		super(50, 50, 50, 50, 50);
	}

	public void realizaHabilidad1(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

	public void realizaHabilidad2(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

	public void realizaHabilidad3(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

	public void realizaHabilidad4(Enemigo ene) {
		ene.recibeDano(getFuerza());
	}

}
