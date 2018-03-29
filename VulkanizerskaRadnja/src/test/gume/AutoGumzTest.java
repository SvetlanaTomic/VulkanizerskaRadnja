package test.gume;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import gume.AutoGuma;

class AutoGumzTest {

	private AutoGuma a;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a=new AutoGuma();
		// ne ulazi u ovaj deo koda
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		a=null;
	}

	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test
	public void testSetMarkaModel() {
		a=new AutoGuma();
		a.setMarkaModel("Tigar");
		assertEquals("Tigar", a.getMarkaModel());
	}
	/*
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	*/
	
	/**
	 * Test method for {@link gume.AutoGuma#setPrecnik(int)}.
	 */
	
	@Test
	public void testSetPrecnik() {
		a=new AutoGuma();
		a.setPrecnik(20);
		assertEquals(20, a.getPrecnik());
	}
	
	/**
	 * Test method for {@link gume.AutoGuma#setSirina(int)}.
	 */
	
	@Test
	public void testSetSirina() {
		a=new AutoGuma();
		a.setSirina(300);
		assertEquals(300, a.getSirina());
	}
	
	/**
	 * Test method for {@link gume.AutoGuma#setVisina(int)}.
	 */
	
	@Test
	public void testSetVisina() {
		a=new AutoGuma();
		a.setVisina(50);
		assertEquals(50, a.getVisina());
	}
	
	/**
	 * Test method for {@link gume.AutoGuma#toString()}.
	 */
	
	@Test
	public void testToString() {
		a=new AutoGuma();
		a.setMarkaModel("Tigar");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);
		assertEquals("AutoGuma [markaModel=Tigar, precnik=20, sirina=150, visina=50]", a.toString());
	}

	/**
	 * Test method for {@link gume.AutoGuma#equals(java.lang.Object)}.
	 */
	
	@Test
	public void testEqualsObject1() {
		AutoGuma a2=new AutoGuma();
		a=new AutoGuma();
		a.setMarkaModel("Tigar");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);
		
		a2.setMarkaModel("Tigar");
		a2.setPrecnik(20);
		a2.setSirina(150);
		a2.setVisina(50);
		
		assertEquals(a.equals(a2), true);
	}
	@Test
	public void testEqualsObject0() {
		AutoGuma a2=new AutoGuma();
		a=new AutoGuma();
		a.setMarkaModel("Tigar");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(50);
		
		a2.setMarkaModel("Tigar");
		a2.setPrecnik(20);
		a2.setSirina(190);
		a2.setVisina(50);
		
		assertEquals(a.equals(a2), false);
}
	
	

}
