package personajestest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Enemigo;
import personajes.Cazador;

class PersonajeTest {

	@Test
	public void testRecibeDano() {
		Cazador robin = new Cazador();
		int dano = 50;
		int expected = robin.getVidaActual() - (dano - dano * (robin.getDefensa() + robin.getDefensaExtra()) / 100);
		robin.recibeDano(dano);
		int actual = robin.getVidaActual();
		assertEquals(expected, actual, "Resta una cantidad de dano a la vida actual teniendo en cuenta la defensa");
	}

	@Test
	public void testRecibeVida1() {
		Cazador robin = new Cazador();
		int dano = 100;
		int cura = 50;
		robin.recibeDano(dano);
		int expected = robin.getVidaActual() + cura;
		robin.recibeVida(cura);
		int actual = robin.getVidaActual();
		assertEquals(expected, actual,
				"Anade una cantidad de vida a la vida actual cuando la vida actual no llega a sobrepasar la constitucion");
	}

	@Test
	public void testRecibeVida2() {
		Cazador robin = new Cazador();
		int dano = 50;
		int cura = 50;
		robin.recibeDano(dano);
		int expected = robin.getConstitucion();
		robin.recibeVida(cura);
		int actual = robin.getVidaActual();
		assertEquals(expected, actual,
				"Anade una cantidad de vida a la vida actual cuando la vida actual sobrepasa la constitucion");
	}

}
