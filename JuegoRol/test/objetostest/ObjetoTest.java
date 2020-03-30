package objetostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import objetos.Caracteristica;
import objetos.Objeto;
import objetos.Tipo;

class ObjetoTest {

	@Test
	public void describeObjetoCollarTest() {
		Objeto target = new Objeto(Tipo.COLLAR, Caracteristica.CONSTITUCION);
		String expected = "COLLAR aumenta en 20 puntos la CONSTITUCION";
		String actual = target.describeObjeto();
		assertEquals(expected, actual, "Comprueba que el objeto es correcto y que se describe correctamente");
	}

	@Test
	public void describeObjetoAnilloTest() {
		Objeto target = new Objeto(Tipo.ANILLO, Caracteristica.CONSTITUCION);
		String expected = "ANILLO aumenta en 40 puntos la CONSTITUCION";
		String actual = target.describeObjeto();
		assertEquals(expected, actual, "Comprueba que el objeto es correcto y que se describe correctamente");
	}

	@Test
	public void describeObjetoAmuletoTest() {
		Objeto target = new Objeto(Tipo.AMULETO, Caracteristica.CONSTITUCION);
		String expected = "AMULETO aumenta en 70 puntos la CONSTITUCION";
		String actual = target.describeObjeto();
		assertEquals(expected, actual, "Comprueba que el objeto es correcto y que se describe correctamente");
	}
}
