package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Huargen;
import personajes.Monje;

class HuargenTest {

	@Test
	void testAtaqueHuargen() {
		Huargen huar=new Huargen(50,50,50,50);
		Monje monk=new Monje();
		huar.ataqueHuargen(monk);
		int dano=80+80*(huar.getFuerza()+huar.getFuerzaExtra())/50;
		int actual=monk.getVidaActual();
		int expected=monk.getConstitucion()-(dano-dano*(monk.getDefensa()+monk.getDefensaExtra())/100);
		assertEquals(expected,actual,"La vida actual debe ser la constitucion menos el dano recibido");
	}

}
