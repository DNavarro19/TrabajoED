package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Hobgoblin;

class HobgoblinTest {

	@Test
	void testAtaqueHobgoblin() {
		Hobgoblin hob= new Hobgoblin(50, 50, 50, 50);
		int expected=20;
		hob.ataqueHobgoblin();
		int actual=hob.getFuerzaExtra();
		assertEquals(expected, actual,"La fuerza extra debe ser 20");
	}

}
