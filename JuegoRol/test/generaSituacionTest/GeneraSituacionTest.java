package generaSituacionTest;

import static org.junit.jupiter.api.Assertions.*;
import logica.Logica;
import org.junit.jupiter.api.Test;

class GeneraSituacionTest {

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
