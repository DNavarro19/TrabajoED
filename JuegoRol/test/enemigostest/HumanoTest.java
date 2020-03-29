package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Humano;

class HumanoTest {

	@Test
	void test() {
		Humano ivan= new Humano(100, 50, 50, 50);
		ivan.setVidaActual(0);
		ivan.ataqueHumano(ivan);
		int expected=80;
		int actual=ivan.getVidaActual();
		assertEquals(expected, actual,"La vida debe estar a 80 puntos");
	}

}
