package tests;

import static org.junit.Assert.assertEquals;
import gui.crearTarjeta;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCrearTarjeta {

	  @BeforeClass
	  public static void testSetup() {
		  
	  }

	  @AfterClass
	  public static void testCleanup() {
		  
	  }

	  @Test
	  public void testcargarSaldo() {
		 crearTarjeta cs =new crearTarjeta();
	     assertEquals("Transaction Succesful", cs.cSaldo("1", "2"));
	  }
	
}
