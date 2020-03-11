package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Enemigo;
import personajes.Monje;

class EnemigoTest {

	@Test
	public void testRecibeDano() {
		Enemigo enemy= new Enemigo(50,50,50,50);
		int dano=50;
		int expected=enemy.getVidaActual()-(dano-dano*(enemy.getDefensa()+enemy.getDefensaExtra())/100);
		enemy.recibeDano(dano);
		int actual=enemy.getVidaActual();
		assertEquals(expected,actual,"Resta una cantidad de dano a la vida actual teniendo en cuenta la defensa");
	}
	
	@Test
	public void testAtaqueBasico() {
		Enemigo enemy=new Enemigo(50,50,50,50);
		Monje monk=new Monje();
		enemy.ataqueBasico(monk);
		int dano=50+50*(enemy.getFuerza()+enemy.getFuerzaExtra())/100;
		int actual=monk.getVidaActual();
		int expected=monk.getConstitucion()-dano;
		assertEquals(expected,actual,"La vida actual debe ser la constitucion menos el dano recibido");
	}
	
	@Test
	public void testRecibeVida() {
		Enemigo enemy=new Enemigo(50,50,50,50);
		enemy.setVidaActual(10);
		int cura=30;
		enemy.recibeVida(cura);
		int actual=enemy.getVidaActual();
		int expected=10+30;
		assertEquals(expected,actual,"La vida debe estar a 40");
	}
	
	@Test
	public void testRecibeVida2() {
		Enemigo enemy=new Enemigo(50,50,50,50);
		int cura=30;
		enemy.recibeVida(cura);
		int actual=enemy.getVidaActual();
		int expected=50;
		assertEquals(expected,actual,"La vida debe estar a 50, el valor de la constitucion");
	}

	@Test
	public void testReset() {
		Enemigo enemy=new Enemigo(50,50,50,50);
		enemy.setFuerzaExtra(50);
		enemy.setDefensaExtra(50);
		enemy.reset();
		int fActual=enemy.getFuerzaExtra();
		int dActual=enemy.getDefensaExtra();
		int fExpected=0;
		int dExpected=0;
		assertEquals(fExpected, fActual,"La fuerza extra debe estar a 0");
		assertEquals(dExpected, dActual,"La defensa extra debe estar a 0");
	}
	
}
