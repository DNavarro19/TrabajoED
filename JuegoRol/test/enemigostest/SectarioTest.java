package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Enemigo;
import enemigos.Sectario;

class SectarioTest {

	@Test
	void test() {
		Sectario sec= new Sectario(100, 50, 50, 50);
		Enemigo ene2= new Enemigo(100,50,50,50);
		Enemigo ene3= new Enemigo(100,50,50,50);
		Enemigo ene4= new Enemigo(100,50,50,50);
		Enemigo [] en = {sec,ene2,ene3,ene4};
		for (int i = 0; i < en.length; i++) {
			en[i].setVidaActual(0);
		}
		sec.ataqueSectario(en);
		int cura = 50 + 50 * (sec.getFuerza() + sec.getFuerzaExtra()) / 100;
		for (int i = 0; i < en.length; i++) {
			int actual=en[i].getVidaActual();
			int expected=cura;
			assertEquals(expected, actual,"La vida a la que estan los enemigos debe ser la misa");
		}
	}

}
