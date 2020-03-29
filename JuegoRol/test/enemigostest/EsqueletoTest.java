package enemigostest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enemigos.Esqueleto;
import personajes.Monje;

class EsqueletoTest {

	@Test
	void testAtaqueEsqueleto() {
		Esqueleto esq=new Esqueleto(50,50,50,50);
		Monje monk=new Monje();
		esq.ataqueEsqueleto(monk);
		int dano=50+50*(esq.getFuerza()+esq.getFuerzaExtra())/100;
		int actual=monk.getVidaActual();
		int expected=monk.getConstitucion()-(dano-dano*(monk.getDefensa()+monk.getDefensaExtra())/100);
		boolean	bExpected=true;
		boolean bActual=monk.isAturdido();
		
		assertEquals(expected,actual,"La vida actual debe ser la constitucion menos el dano recibido");
		assertEquals(bExpected,bActual,"El personaje debe estar aturdido");
	}

}
