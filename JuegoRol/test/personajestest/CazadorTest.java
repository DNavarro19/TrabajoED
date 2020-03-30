package personajestest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import enemigos.Analista;
import personajes.Cazador;

/**
 * Pruebas que comprueban cada habilidad del cazador
 * 
 * @author David
 *
 */
class CazadorTest {

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
	public void disparoArcoTest() {
		Cazador robin = new Cazador();
		Analista ene = new Analista(50, 50, 50, 50);
		int dano = 50 + 50 * (robin.getFuerza() + robin.getFuerzaExtra()) / 100;
		int expected = ene.getVidaActual() - (dano - dano * (ene.getDefensa() + ene.getDefensaExtra()) / 100);
		robin.disparoArco(ene);
		int actual = ene.getVidaActual();
		assertEquals(expected, actual, "Comprueba que se hace el daño correctamente");
	}

	@Test
	public void punaladaTest() {
		Cazador robin = new Cazador();
		Analista ene = new Analista(50, 50, 50, 50);
		int dano = (50 + 50 * (robin.getFuerza() + robin.getFuerzaExtra()) / 100) * 2;
		int expected = ene.getVidaActual() - (dano - dano * (ene.getDefensa() + ene.getDefensaExtra()) / 100);
		robin.punalada(ene);
		int actual = ene.getVidaActual();
		assertEquals(expected, actual, "Comprueba que se hace el daño correctamente");
	}

	@Test
	public void esquivarTest() {
		Cazador robin = new Cazador();
		robin.esquivar();
		boolean actual = robin.isEsquiva();
		assertTrue(actual, "Comprueba que el personaje esquivara el ataque");
	}

	@Test
	public void disparoMultipleTest() {
		Cazador robin = new Cazador();
		Analista ene = new Analista(50, 50, 50, 50);
		Analista ene2 = new Analista(50, 50, 50, 50);
		int dano = 50 + 50 * (robin.getFuerza() + robin.getFuerzaExtra()) / 100;
		int expected1 = ene.getVidaActual() - (dano - dano * (ene.getDefensa() + ene.getDefensaExtra()) / 100);
		int expected2 = ene2.getVidaActual() - (dano - dano * (ene2.getDefensa() + ene2.getDefensaExtra()) / 100);
		robin.disparoMultiple(ene, ene2);
		int actual = ene.getVidaActual();
		assertEquals(expected1, actual, "Comprueba que se hace el daño correctamente");
		assertEquals(expected2, actual, "Comprueba que se hace el daño correctamente");
	}

	@Test
	public void muestraAtaqueTest() {
		Cazador robin = new Cazador();
		robin.muestraAtaque();
		assertEquals("1)Disparo con arco\r\n" + "2)Punalada\r\n" + "3)Esquivar\r\n" + "4)Disparo multiple\r\n",
				outContent.toString());
	}
}
