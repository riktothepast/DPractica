package tests;

import static org.junit.Assert.assertNotNull;
import gui.consultarSaldo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestConsultarSaldo {
	  @BeforeClass
	  public static void testSetup() {
		  
	  }

	  @AfterClass
	  public static void testCleanup() {
		  
	  }

	  @Test
	  public void testcargarSaldo() {
		 consultarSaldo cs =new consultarSaldo();
		 assertNotNull(cs.cSaldo("1"));
	  }
}
