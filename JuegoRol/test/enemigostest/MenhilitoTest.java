package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Menhilito;

class MenhilitoTest {

	@Test
	void testAtaqueMenhilito() {
		Menhilito men= new Menhilito(50, 50, 50, 50);
		int expected=50;
		men.ataqueMenhilito();
		int actual=men.getDefensaExtra();
		assertEquals(expected, actual,"La defensa extra debe ser 50");
	}

}
