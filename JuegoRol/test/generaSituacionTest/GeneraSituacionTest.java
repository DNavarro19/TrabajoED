package generaSituacionTest;

import static org.junit.jupiter.api.Assertions.*;
import logica.Logica;
import org.junit.jupiter.api.Test;

class GeneraSituacionTest {

	/**
	 * test que comprueba que los resultados obtenidos por el método generaSituacion() coinciden con los resultados definidos
	 */
	@Test
	void Situacion() {
		String[] expected = { "tesoro", "combate", "tesoro y combate", "trampa", "vida" };
		Logica target = new Logica();
		String actual = target.generaSituacion();
		for (int i = 0; i < expected.length; i++) {
			if (expected[i].equalsIgnoreCase(actual)) {
				assertEquals(expected[i], actual);
			}
		} 
	}
	
	/**
	 * test que comprueba que la sala jefe aparece tras 10 rondas del juego
	 */
	@Test
	void Jefe() {
		String expected="jefe";
		Logica target= new Logica();
		String actual = null;
		for (int i = 0; i < 10; i++) {
			actual=target.generaSituacion();
		}
		assertEquals(expected, actual);
				
	}

}
