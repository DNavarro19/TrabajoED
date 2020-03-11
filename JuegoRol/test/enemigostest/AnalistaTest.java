package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Analista;
import personajes.Monje;
import personajes.Personaje;

class AnalistaTest {

	@Test
	void testAtaqueAnalista() {
		Analista ana= new Analista(50,50,50,50);
		Monje monk1= new Monje();
		Monje monk2= new Monje();
		Monje monk3= new Monje();
		Monje monk4= new Monje();
		Personaje [] pjs = {monk1,monk2,monk3,monk4};
		for (int i = 0; i < pjs.length; i++) {
			int expected=pjs[i].getConstitucion()-50+50*(ana.getFuerza()+ana.getFuerzaExtra())/100;
		}
	}

}
