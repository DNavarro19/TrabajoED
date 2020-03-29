package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import enemigos.Fantasma;
import personajes.Monje;
import personajes.Personaje;

class FantasmaTest {

	@Test
	void testAtaqueFantasma() {
		Fantasma fan= new Fantasma(50,50,50,50);
		Monje monk1= new Monje();
		Monje monk2= new Monje();
		Monje monk3= new Monje();
		Monje monk4= new Monje();
		Personaje [] pjs = {monk1,monk2,monk3,monk4};
		int dano = 60+60*(fan.getFuerza() + fan.getFuerzaExtra())/100;
		fan.ataqueFantasma(pjs);
		for (int i = 0; i < pjs.length; i++) {
			int expected=pjs[i].getConstitucion()-(dano - dano * (pjs[i].getDefensa() + pjs[i].getDefensaExtra()) / 100);
			int actual=pjs[i].getVidaActual();
			assertEquals(expected,actual,"La vida debe ser la misma");
		}
	}

}
