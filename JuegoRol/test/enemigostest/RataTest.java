package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Rata;
import personajes.Monje;

class RataTest {

	@Test
	void testAtaqueRata() {
		Rata rat=new Rata(50,50,50,50);
		Monje monk=new Monje();
		rat.ataqueRata(monk);
		int dano=50+50*(rat.getFuerza() + rat.getFuerzaExtra())/50;
		int actual=monk.getVidaActual();
		int expected=monk.getConstitucion()-(dano-dano*(monk.getDefensa()+monk.getDefensaExtra())/100);
		assertEquals(expected,actual,"La vida actual debe ser la constitucion menos el dano recibido");
	}

}
