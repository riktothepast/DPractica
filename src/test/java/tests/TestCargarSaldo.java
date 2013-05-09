package tests;


import static org.junit.Assert.assertNotNull;
import gui.cargarSaldo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCargarSaldo {

  @BeforeClass
  public static void testSetup() {
	  
  }

  @AfterClass
  public static void testCleanup() {
	  
  }

  @Test
  public void testcargarSaldo() {
	 cargarSaldo cs =new cargarSaldo();
     assertNotNull(cs.cSaldo("1", "20"));
  }
  
} 
