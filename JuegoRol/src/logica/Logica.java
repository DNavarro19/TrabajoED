package logica;

public class Logica {
		/**
		 * método que genera un numer aleatorio y en funcion de ese numero devuelve una situacion
		 * @return
		 * <ul>
		 * <li>si el numero esta entre 1-15 la situacion es de tesoro</li>
		 * <li>si el numero esta entre 16-65 la situacion es de combate</li>
		 * <li>si el numero esta entre 66-85 la situacion es de combate y tesoro</li>
		 * <li>si el numero esta entre 86-95 la situacion es de trampa</li>
		 * <li>si el numero esta entre 96-100 la situacion es de restauracion de vida</li>
		 */
		public String generaSituacion() {
			double situacion=generaAleatorio();
			if(situacion>=1 && situacion<=15) {
				return "tesoro";
			}
			else if(situacion>15&&situacion<=65){
					return "combate";
			}
			else if(situacion>65&&situacion<=85) {
				return "tesoro+combate";
			}
			else if(situacion>85&&situacion<=95) {
				return "trampa";
			}
			else
				return "vida";
					
			}

		private double generaAleatorio() {
			return Math.random() * 100 + 1;
		}
	}
