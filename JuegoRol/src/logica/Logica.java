package logica;

import menu.Menu;

public class Logica {
	/**
	 * metodo que genera un numero aleatorio y en funcion de ese numero devuelve una
	 * situacion
	 * 
	 * @return
	 *         <ul>
	 *         <li>si el numero esta entre 1-15 la situacion es de tesoro</li>
	 *         <li>si el numero esta entre 16-65 la situacion es de combate</li>
	 *         <li>si el numero esta entre 66-85 la situacion es de combate y
	 *         tesoro</li>
	 *         <li>si el numero esta entre 86-95 la situacion es de trampa</li>
	 *         <li>si el numero esta entre 96-100 la situacion es de restauracion de
	 *         vida</li>
	 */
	public void generaSituacion() {
		Menu m=new Menu();
		double situacion = generaAleatorio();
		if (situacion >= 1 && situacion <= 15) {
			//tesoro
			m.opcionesSala();
			m.opcionesTesoro();
		} else if (situacion > 15 && situacion <= 65) {
			// combate
			//anadir codigo para la situacion de combate
		} else if (situacion > 65 && situacion <= 85) {
		//	return "tesoro+combate";
		} else if (situacion > 85 && situacion <= 95) {
			//return "trampa";
		} else
			System.out.println("");
			//return "vida";

	}
	/**
	 * método que genera el numero aleatorio que se usa para elegir la situación
	 * @return némero aleatorio entre 1-100
	 */
	private double generaAleatorio() {
		return Math.random() * 100 + 1;
	}
}
