package tests;

import static org.junit.Assert.assertEquals;
import gui.debitarTarjeta;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDebitarSaldo {


	  @BeforeClass
	  public static void testSetup() {
		  
	  }

	  @AfterClass
	  public static void testCleanup() {
		  
	  }

	  @Test
	  public void testcargarSaldo() {
		 debitarTarjeta cs =new debitarTarjeta();
	     assertEquals("Transaction Succesful", cs.cSaldo("1", "20"));
	  }
}
