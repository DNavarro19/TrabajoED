package menuTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import menu.Menu;
import personajes.*;

class MenuTest {

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
	void opcionesSalaTest() {
		Menu target = new Menu();
		target.opcionesSala();
		assertEquals("\n1)siguiente sala\n2)mostrar vida", outContent.toString());
	}
	@Test 
	void opcionesTesoroTest() {
		Menu target =new Menu();
		target.opcionesTesoro();
		assertEquals("\n4)abrir tesoro",outContent.toString());
	}
	@Test
	void eligeObjetoTest() {
		Menu target =new Menu();
		target.eligeObjeto();
		assertEquals("\n1)amuleto\n" + "2)anillo\n" + "3)collar\n" + "4)[MOSTRAR DETALLES DE LOS OBJETOS]",outContent.toString());
	}
	@Test
	void muestraCombateTestCazador() {
		Menu target = new Menu();
		Personaje Cazadaor=new Cazador();
		target.opcionesCombate(Cazadaor);
		assertEquals("1)Disparo con arco\n"+"2)Punalada\n"+"3)Esquivar\n"+"4)Disparo multiple",outContent.toString());
	}
	void muestraCombateTestClerigo() {
		Menu target = new Menu();
		Personaje Clerigo=new Clerigo();
		target.opcionesCombate(Clerigo);
		assertEquals("1)Ataque con baston\n"+"2)Ola de Sanacion\n"+"3)Mano Bendita\n"+"4)Cura Mayor",outContent.toString());
	}
	void muestraCombateTestGuerrero() {
		Menu target = new Menu();
		Personaje Guerrero=new Guerrero();
		target.opcionesCombate(Guerrero);
		assertEquals("1)Espadazo\n"+"2)Estocada\n"+"3)Alzar Escudo\n"+"4)Carga",outContent.toString());
	}
	void muestraCombateTestMago() {
		Menu target = new Menu();
		Personaje Mago=new Mago();
		target.opcionesCombate(Mago);
		assertEquals("1)Hechizo\n"+"2)Bola de fuego\n"+"3)Nova\n"+"4)Rafaga Arcana",outContent.toString());
	}
	void muestraCombateTestMonje() {
		Menu target = new Menu();
		Personaje Monje=new Mago();
		target.opcionesCombate(Monje);
		assertEquals("1)Golpe con vara\n"+"2)Posicion de defensa\n"+"3)Combo Ken\n"+"4)Cabezazo",outContent.toString());
	}
	
	//"Golpe con vara", "Posicion de defensa", "Combo Ken", "Cabezazo" };
}
