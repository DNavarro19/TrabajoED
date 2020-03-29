package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Enemigo;
import enemigos.JefeProyecto;

class JefeProyectoTest {

	@Test
	void testAtaqueJefeProyecto() {
		JefeProyecto jefe= new JefeProyecto(50,50,50,50);
		Enemigo ene2= new Enemigo(50,50,50,50);
		Enemigo ene3= new Enemigo(50,50,50,50);
		Enemigo ene4= new Enemigo(50,50,50,50);
		Enemigo [] en = {jefe,ene2,ene3,ene4};
		jefe.ataqueJefe(en);
		for (int i = 0; i < en.length; i++) {
			int actual=en[i].getFuerzaExtra();
			int expected=25;
			assertEquals(expected, actual,"La fuerza extra de los enemigos debe ser 25");
		}
	}

}
