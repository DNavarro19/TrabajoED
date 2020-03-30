package personajestest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import enemigos.Analista;
import personajes.Cazador;
import personajes.Clerigo;
import personajes.Guerrero;
import personajes.Personaje;

/**
 * Pruebas que comprueban cada habilidad del cazador
 * 
 * @author David
 *
 */
class ClerigoTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private static final PrintStream originalOut = System.out;

	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
	}

	@Test
	public void ataqueBastonTest() {
		Clerigo c = new Clerigo();
		Analista ene = new Analista(50, 50, 50, 50);
		int dano = 50 + 50 * (c.getFuerza() + c.getFuerzaExtra()) / 100;
		int expected = ene.getVidaActual() - (dano - dano * (ene.getDefensa() + ene.getDefensaExtra()) / 100);
		c.ataqueBaston(ene);
		int actual = ene.getVidaActual();
		assertEquals(expected, actual, "Comprueba que se hace el daño correctamente");
	}

	@Test
	public void olaSanacionTest() {
		Clerigo c = new Clerigo();
		Personaje[] p = { new Cazador(), new Guerrero() };
		int dano = 100;
		int cura = 25 + 25 * (c.getFuerza() + c.getFuerzaExtra()) / 100;
		p[0].recibeDano(dano);
		p[1].recibeDano(dano);
		int expected1 = p[0].getVidaActual() + cura;
		int expected2 = p[1].getVidaActual() + cura;
		c.olaSanacion(p);
		int actual1 = p[0].getVidaActual();
		int actual2 = p[1].getVidaActual();
		assertEquals(expected1, actual1, "Comprueba que el personaje 1 se ha curado");
		assertEquals(expected2, actual2, "Comprueba que el personaje 2 se ha curado");
	}

	@Test
	public void manoBenditaTest() {
		Clerigo c = new Clerigo();
		Cazador robin = new Cazador();
		int expected = 25;
		c.manoBendita(robin);
		int actual = robin.getFuerzaExtra();
		assertEquals(expected, actual, "Comprueba que se le ha añadido correctamente la fuerza extra al personaje");
	}

	@Test
	public void curaMayorTest() {
		Clerigo c = new Clerigo();
		Cazador robin = new Cazador();
		int dano = 100;
		robin.recibeDano(dano);
		int expected = robin.getConstitucion();
		c.curaMayor(robin);
		int actual = robin.getVidaActual();
		assertEquals(expected, actual, "Comprueba que cura correctamente al personaje");
	}

	@Test
	public void muestraAtaqueTest() {
		Clerigo c = new Clerigo();
		c.muestraAtaque();
		assertEquals("1)Ataque con baston\r\n" + "2)Ola de Sanacion\r\n" + "3)Mano Bendita\r\n" + "4)Cura Mayor\r\n",
				outContent.toString());
	}
}
