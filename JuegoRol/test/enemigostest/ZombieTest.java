package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Zombie;

class ZombieTest {

	@Test
	void testAtaqueZombie() {
		Zombie men= new Zombie(50, 50, 50, 50);
		int expected=35;
		men.ataqueZombie();
		int actual=men.getDefensaExtra();
		assertEquals(expected, actual,"La defensa extra debe ser 35");
	}

}
