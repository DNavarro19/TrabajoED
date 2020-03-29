package personajestest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import enemigos.Analista;
import personajes.Cazador;
import personajes.Guerrero;

class GuerreroTest {
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
	public void espadazoTest() {
		Guerrero g = new Guerrero();
		Analista ene = new Analista(50, 50, 50, 50);
		int dano = 50 + 50 * (g.getFuerza() + g.getFuerzaExtra()) / 100;
		int expected = ene.getVidaActual() - (dano - dano * (ene.getDefensa() + ene.getDefensaExtra()) / 100);
		g.espadazo(ene);
		int actual = ene.getVidaActual();
		assertEquals(expected, actual, "Comprueba que se hace el daño correctamente");
	}

	@Test
	public void estocadaTest() {
		Guerrero g = new Guerrero();
		Analista ene = new Analista(50, 50, 50, 50);
		Analista ene2 = new Analista(50, 50, 50, 50);
		int dano = 50 + 50 * (g.getFuerza() + g.getFuerzaExtra()) / 100;
		int expected1 = ene.getVidaActual() - (dano - dano * (ene.getDefensa() + ene.getDefensaExtra()) / 100);
		int expected2 = ene2.getVidaActual() - (dano - dano * (ene2.getDefensa() + ene2.getDefensaExtra()) / 100);
		g.estocada(ene, ene2);
		int actual = ene.getVidaActual();
		assertEquals(expected1, actual, "Comprueba que se hace el daño correctamente");
		assertEquals(expected2, actual, "Comprueba que se hace el daño correctamente");
	}

	@Test
	public void alzarEscudoTest() {
		Guerrero g = new Guerrero();
		int expected = 50;
		g.alzarEscudo();
		int actual = g.getDefensaExtra();
		assertEquals(expected, actual, "Comprueba que se añade correctamente la defensa extra");
	}

	@Test
	public void cargaTest() {
		Guerrero g = new Guerrero();
		Analista ene = new Analista(50, 50, 50, 50);
		int dano = 50 + 50 * (g.getFuerza() + g.getFuerzaExtra()) / 100;
		int expected = ene.getVidaActual() - (dano - dano * (ene.getDefensa() + ene.getDefensaExtra()) / 100);
		g.carga(ene);
		int actual = ene.getVidaActual();
		boolean actual2 = ene.isAturdido();
		assertEquals(expected, actual, "Comprueba que se hace el daño correctamente");
		assertTrue(actual2, "Comprueba que el enemigo esta aturdido");
	}

	@Test
	public void muestraAtaqueTest() {
		Guerrero g = new Guerrero();
		g.muestraAtaque();
		assertEquals("1)Espadazo\r\n" + "2)Estocada\r\n" + "3)Alzar Escudo\r\n" + "4)Carga\r\n", outContent.toString());
	}
}
