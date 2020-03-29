package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import enemigos.Oveja;

class OvejaTest {

	@Test
	void testAtaqueOveja() {
		Oveja ovej= new Oveja(100, 50, 50, 50);
		ovej.setVidaActual(0);
		ovej.ataqueOveja(ovej);
		int expected=60;
		int actual=ovej.getVidaActual();
		assertEquals(expected, actual,"La vida debe estar a 60 puntos");
	}

}
