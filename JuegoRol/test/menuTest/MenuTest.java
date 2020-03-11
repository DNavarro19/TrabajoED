package menuTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import menu.Menu;

class MenuTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	//    System.setErr(originalErr);
	}

	@Test
	void opcionesSalaTest() {
		 Menu target=new Menu();
		 target.opcionesSala();
		 assertEquals("1)siguiente sala\\n2)mostrar vid", outContent.toString());
	}

}
