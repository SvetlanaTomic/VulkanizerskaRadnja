package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class AutoGumaTest {
	AutoGuma a;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
	a = null;
	}

	@Test
	public void testSetMarkaModel() {
	a.setMarkaModel("Renault Capture");
	assertEquals("Renault Capture", a.getMarkaModel());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		a.setMarkaModel("");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	
	
	@Test
	public void testSetPrecnik() {
		a.setPrecnik(20);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManji() {
		a.setPrecnik(5);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeci() {
		a.setPrecnik(100);
	}	
	
	@Test
	public void testSetSirina() {
		a.setSirina(190);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManja() {
		a.setSirina(50);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaVeca() {
		a.setSirina(550);
	}
	
	@Test
	public void testSetVisina() {
		a.setVisina(50);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManja() {
		a.setVisina(5);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVeca() {
		a.setVisina(100);
	}
	@Test
	public void testToString() {
		a.setMarkaModel("Renault Capture");
		a.setPrecnik(20);
		a.setSirina(190);
		a.setVisina(50);
		assertEquals("AutoGuma [markaModel=Renault Capture, precnik=20, sirina=190, visina=50]", a.toString());
	}

	@Test
	public void testEqualsObject() {
		a.setMarkaModel("Renault Capture");
		a.setPrecnik(20);
		a.setSirina(190);
		a.setVisina(50);
	
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Renault Capture");
		a2.setPrecnik(20);
		a2.setSirina(190);
		a2.setVisina(50);
		
	assertTrue(a.equals(a2));	
	}

	
	@Test 
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Renault Capture");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(60);
	
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Renault Capture");
		a2.setPrecnik(20);
		a2.setSirina(190);
		a2.setVisina(50);
		
	assertFalse(a.equals(a2));
	}
	

	
}