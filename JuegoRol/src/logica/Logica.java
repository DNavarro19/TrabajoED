package logica;

/**
 * 
 * @author Pablo Meca Sanchez
 *
 */
public class Logica {

	// numero estático que se irá incrementando segun se avance por el juego para
	// alcanzar al jefe final
	private static int NumSalas = 0;

	/**
	 * metodo que genera un numero aleatorio y en funcion de ese numero devuelve una
	 * situacion. También incrementa el valor de la variable NumSalas, que es un contador
	 * usado para saber cuantas salas llevas recorridas.
	 * 
	 * @return
	 *         <ul>
	 *         <li>Si el numero de salas recorridas es igual a 10, entra la sala del jefe</li>
	 *   		
	 *   		<li>Si no:
	 *  		 <ul>
	 *         <li>si el numero esta entre 1-15 la situacion es de tesoro</li>
	 *         <li>si el numero esta entre 16-65 la situacion es de combate</li>
	 *         <li>si el numero esta entre 66-85 la situacion es de combate y
	 *         tesoro</li>
	 *         <li>si el numero esta entre 86-95 la situacion es de trampa</li>
	 *         <li>si el numero esta entre 96-100 la situacion es de restauracion de
	 *         vida</li>
	 *         <ul>
	 *         </ul>
	 */
	public String generaSituacion() {
		double situacion = generaAleatorio();
		String sala;
		NumSalas++;
		if (NumSalas == 10) {
			NumSalas=0;
			sala = "jefe";
		} else {
		
		if (situacion >= 1 && situacion <= 15) {
			sala = "tesoro";
		} else if (situacion > 15 && situacion <= 65) {
			sala = "combate";
			// anadir codigo para la situacion de combate
		} else if (situacion > 65 && situacion <= 85) {
			sala = "tesoro y combate";
		} else if (situacion > 85 && situacion <= 95) {
			sala = "trampa";
		} else {
			sala= "vida";
		}
		}
		return sala;
	}


	/**
	 * método que genera el numero aleatorio que se usa para elegir la situación
	 * 
	 * @return numero aleatorio entre 1-100
	 */
	private double generaAleatorio() {
		return Math.random() * 100 + 1;
	}
}
