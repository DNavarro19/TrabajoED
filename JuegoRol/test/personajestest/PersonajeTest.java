package personajestest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Enemigo;
import objetos.Caracteristica;
import objetos.Objeto;
import objetos.Tipo;
import personajes.Cazador;

/**
 * Pruebas que comprueban que el personaje recibe dano y vida, que usa y equipa
 * objetos y que resetea los atributos extra correctamente
 * 
 * @author David
 *
 */
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

	@Test
	public void testUsaObjeto() {
		Objeto item = new Objeto(Tipo.AMULETO, Caracteristica.CONSTITUCION);
		Cazador robin = new Cazador();
		int expected = robin.getConstitucion() + item.getPuntos();
		robin.usaObjeto(item);
		int actual = robin.getConstitucion();
		assertEquals(expected, actual, "Usa un objeto y anade sus puntos a la caracteristica correspondiente");
	}

	@Test
	public void testEquipaObjeto() {
		Objeto item = new Objeto(Tipo.AMULETO, Caracteristica.CONSTITUCION);
		Cazador robin = new Cazador();
		Objeto[] expected = new Objeto[5];
		expected[0] = item;
		robin.equipaObjeto(item);
		Objeto[] actual = robin.getObjetos();
		assertArrayEquals(expected, actual, "Equipa un objeto a un personaje");
	}

	@Test
	public void testReset() {
		Cazador robin = new Cazador();
		robin.setFuerzaExtra(50);
		robin.setDefensaExtra(50);
		robin.reset();
		int fActual = robin.getFuerzaExtra();
		int dActual = robin.getDefensaExtra();
		int fExpected = 0;
		int dExpected = 0;
		assertEquals(fExpected, fActual, "La fuerza extra debe estar a 0");
		assertEquals(dExpected, dActual, "La defensa extra debe estar a 0");
	}
}
