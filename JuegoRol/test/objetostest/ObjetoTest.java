package objetostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import objetos.Caracteristica;
import objetos.Objeto;
import objetos.Tipo;

class ObjetoTest {

	@Test
	public void describeObjetoCollarTest() {
		Objeto target = new Objeto(Tipo.Collar, Caracteristica.Constitucion);
		String expected = "Collar aumenta en 20 puntos la Constitucion";
		String actual = target.describeObjeto();
		assertEquals(expected, actual, "Comprueba que el objeto es correcto y que se describe correctamente");
	}

	@Test
	public void describeObjetoAnilloTest() {
		Objeto target = new Objeto(Tipo.Anillo, Caracteristica.Constitucion);
		String expected = "Anillo aumenta en 40 puntos la Constitucion";
		String actual = target.describeObjeto();
		assertEquals(expected, actual, "Comprueba que el objeto es correcto y que se describe correctamente");
	}

	@Test
	public void describeObjetoAmuletoTest() {
		Objeto target = new Objeto(Tipo.Amuleto, Caracteristica.Constitucion);
		String expected = "Amuleto aumenta en 70 puntos la Constitucion";
		String actual = target.describeObjeto();
		assertEquals(expected, actual, "Comprueba que el objeto es correcto y que se describe correctamente");
	}
}
