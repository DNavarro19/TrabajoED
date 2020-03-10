package enemigosTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Enemigo;
import personajes.Personaje;

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
	public void testAtaqueBasico(Personaje p) {
		Enemigo enemy=new Enemigo(50,50,50,50);
		int expected=50+50*(enemy.getFuerza()+enemy.getFuerzaExtra())/100;
		int actual=50+50*(50+0)/100;
		assertEquals(expected,actual,"La cantidad de dano que va a realizar el ataque basico");
	}

}
