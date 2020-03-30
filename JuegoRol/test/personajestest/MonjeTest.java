package personajestest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import enemigos.Analista;
import personajes.Monje;

class MonjeTest {
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
	public void golpeVaraTest() {
		Monje m = new Monje();
		Analista ene = new Analista(50, 50, 50, 50);
		int dano = 50 + 50 * (m.getFuerza() + m.getFuerzaExtra()) / 100;
		int expected = ene.getVidaActual() - (dano - dano * (ene.getDefensa() + ene.getDefensaExtra()) / 100);
		m.golpeVara(ene);
		int actual = ene.getVidaActual();
		assertEquals(expected, actual, "Comprueba que se hace el daño correctamente");
	}

	@Test
	public void posicionDefensaTest() {
		Monje m = new Monje();
		m.posicionDefensa();
		boolean actual = m.isEsquiva();
		assertTrue(actual, "Comprueba que el personaje esquivara el ataque");
	}

	@Test
	public void comboKenTest() {
		Monje m = new Monje();
		Analista ene = new Analista(50, 50, 50, 50);
		Analista ene2 = new Analista(50, 50, 50, 50);
		int dano = 50 + 50 * (m.getFuerza() + m.getFuerzaExtra()) / 100;
		int expected1 = ene.getVidaActual() - (dano - dano * (ene.getDefensa() + ene.getDefensaExtra()) / 100);
		int expected2 = ene2.getVidaActual() - (dano - dano * (ene2.getDefensa() + ene2.getDefensaExtra()) / 100);
		m.comboKen(ene, ene2);
		int actual = ene.getVidaActual();
		assertEquals(expected1, actual, "Comprueba que se hace el daño correctamente");
		assertEquals(expected2, actual, "Comprueba que se hace el daño correctamente");
	}

	@Test
	public void cabezazoTest() {
		Monje m = new Monje();
		Analista ene = new Analista(50, 50, 50, 50);
		m.cabezazo(ene);
		boolean actual = ene.isAturdido();
		assertTrue(actual, "Comprueba que el enemigo esta aturdido");
	}

	@Test
	public void muestraAtaqueTest() {
		Monje m = new Monje();
		m.muestraAtaque();
		assertEquals("1)Golpe con vara\r\n" + "2)Posicion de defensa\r\n" + "3)Combo Ken\r\n" + "4)Cabezazo\r\n",
				outContent.toString());
	}
}
