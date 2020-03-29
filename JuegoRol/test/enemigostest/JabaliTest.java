package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Jabali;
import personajes.Monje;

class JabaliTest {

	@Test
	void testAtaqueJabali() {
		Jabali jab= new Jabali(50, 50, 50, 50);
		Monje monk1= new Monje();
		Monje monk2= new Monje();
		jab.ataqueJabali(monk1, monk2);
		int actual1=monk1.getVidaActual();
		int actual2=monk2.getVidaActual();
		int dano=50+50*(jab.getFuerza()+jab.getFuerzaExtra())/100;
		int expected1=monk1.getConstitucion()-(dano - dano * (monk1.getDefensa() + monk1.getDefensaExtra()) / 100);
		int expected2=monk2.getConstitucion()-(dano - dano * (monk2.getDefensa() + monk2.getDefensaExtra()) / 100);
		assertEquals(expected1, actual1,"La vida del primer personaje debe ser la misma");
		assertEquals(expected2, actual2,"La vida del segundo personaje debe ser la misma");
	}

}
