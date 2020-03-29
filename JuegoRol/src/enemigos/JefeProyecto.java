package enemigos;

/**
 * Clase Gerente, enemigo del piso 5
 * 
 * @author Ivan
 * 
 */
public class JefeProyecto extends Enemigo{

	/**
	 * Metodo constructor, en el que se le anade el nombre
	 * @param cons valor que equivale a los puntos de vida
	 * @param fuer valor que se utiliza como bonus al dano
	 * @param dest valor que define el turno 
	 * @param def valor que reduce la cantidad de dano recibido
	 * @param res valor que define la cantidad de habilidades posibles a usar
	 */
	public JefeProyecto(int cons, int fuer, int dest, int def) {
		super(cons, fuer, dest, def);
		super.nombre="Gerente";	}

	/**
	 * Metodo en el que el jefe de proyecto aumenta la fuerza de todos sus compañeros y el mismo
	 * @param en
	 */
	public void ataqueJefe(Enemigo [] en) {
		for (int i = 0; i < en.length; i++) {
			en[i].fuerzaExtra+=25;
		}
	}
}
