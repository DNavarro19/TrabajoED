package personajestest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import enemigos.Analista;
import enemigos.Enemigo;
import personajes.Cazador;
import personajes.Mago;

class MagoTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
	}

	@Test
	public void hechizoTest() {
		Mago m = new Mago();
		Analista ene = new Analista(50, 50, 50, 50);
		int dano = 50 + 50 * (m.getFuerza() + m.getFuerzaExtra()) / 100;
		int expected = ene.getVidaActual() - (dano - dano * (ene.getDefensa() + ene.getDefensaExtra()) / 100);
		m.hechizo(ene);
		int actual = ene.getVidaActual();
		assertEquals(expected, actual, "Comprueba que se hace el daño correctamente");
	}

	@Test
	public void bolaFuegoTest() {
		Mago m = new Mago();
		Analista ene = new Analista(50, 50, 50, 50);
		int dano = 100 + 100 * (m.getFuerza() + m.getFuerzaExtra()) / 100;
		int expected = ene.getVidaActual() - (dano - dano * (ene.getDefensa() + ene.getDefensaExtra()) / 100);
		m.bolaFuego(ene);
		int actual = ene.getVidaActual();
		assertEquals(expected, actual, "Comprueba que se hace el daño correctamente");
	}

	@Test
	public void novaTest() {
		Mago m = new Mago();
		Enemigo[] ene = { new Analista(50, 50, 50, 50), new Analista(50, 50, 50, 50) };
		int dano = 50 + 50 * (m.getFuerza() + m.getFuerzaExtra()) / 100;
		m.nova(ene);
		for (int i = 0; i < ene.length; i++) {
			int expected = ene[i].getConstitucion()
					- (dano - dano * (ene[i].getDefensa() + ene[i].getDefensaExtra()) / 100);
			int actual = ene[i].getVidaActual();
			assertEquals(expected, actual, "Comprueba que se hace el daño correctamente");
		}
	}

	@Test
	public void rafagaArcanaTest() {
		Mago m = new Mago();
		Analista ene = new Analista(50, 50, 50, 50);
		int dano = 50 + 50 * (m.getFuerza() + m.getFuerzaExtra()) / 100;
		int expected = ene.getConstitucion();
		m.rafagaArcana(ene);
		int actual = ene.getVidaActual();
		for (int i = 0; i < 5; i++) {
			expected -= (dano - dano * (ene.getDefensa() + ene.getDefensaExtra()) / 100);
			if (expected == actual) {
				assertEquals(expected, actual, "Comprueba que se hace el daño correctamente");
			}
		}
	}

	@Test
	public void muestraAtaqueTest() {
		Mago m = new Mago();
		m.muestraAtaque();
		assertEquals("1)Hechizo\r\n" + "2)Bola de fuego\r\n" + "3)Nova\r\n" + "4)Rafaga Arcana\r\n",
				outContent.toString());
	}
}
