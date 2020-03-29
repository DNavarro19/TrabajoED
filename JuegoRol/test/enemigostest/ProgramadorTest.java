package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Enemigo;
import enemigos.Programador;

class ProgramadorTest {

	@Test
	void testAtaqueProgramador() {
		Programador jefe= new Programador(50,50,50,50);
		Enemigo ene2= new Enemigo(50,50,50,50);
		Enemigo ene3= new Enemigo(50,50,50,50);
		Enemigo ene4= new Enemigo(50,50,50,50);
		Enemigo [] en = {jefe,ene2,ene3,ene4};
		jefe.ataqueProgramador(en);
		for (int i = 0; i < en.length; i++) {
			int actual=en[i].getDefensaExtra();
			int expected=30;
			assertEquals(expected, actual,"La defensa extra de los enemigos debe ser 30");
		}
	}
	
}


