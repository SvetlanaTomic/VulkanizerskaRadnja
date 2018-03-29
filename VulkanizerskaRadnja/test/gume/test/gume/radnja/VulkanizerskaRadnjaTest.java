package gume.test.gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;
import gume.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja v;
	AutoGuma a;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	v = new VulkanizerskaRadnja();
	a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
	v = null;
	a = null;
	}

	@Test
	public void testDodajGumu() {
		a.setMarkaModel("Renault Capture");
		a.setPrecnik(20);
		a.setSirina(190);
		a.setVisina(50);
		v.dodajGumu(a);	
	assertEquals(a, v.getGume().getFirst());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuNull() {
	a = null;
	v.dodajGumu(a);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuPostoji() {
		a.setMarkaModel("Renault Capture");
		a.setPrecnik(20);
		a.setSirina(190);
		a.setVisina(50);
		v.dodajGumu(a);	
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Renault Capture");
		a2.setPrecnik(20);
		a2.setSirina(190);
		a2.setVisina(50);
		v.dodajGumu(a2);	
	}
	
	
	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null, v.pronadjiGumu(null));
	}

	@Test
	public void testPronadjiGumuNePostoji() {
		assertEquals(0, v.pronadjiGumu("Altenzo 245/45").size());
	}

	@Test
	public void testPronadjiGumuJedna() {
		a.setMarkaModel("Renault Capture");
		a.setPrecnik(20);
		a.setSirina(190);
		a.setVisina(50);
		v.dodajGumu(a);	
		
		assertEquals(1, v.pronadjiGumu("Renault Capture").size());
	}

	@Test
	public void testPronadjiGumuVise() {
		a.setMarkaModel("Renault Capture");
		a.setPrecnik(20);
		a.setSirina(190);
		a.setVisina(60);
		v.dodajGumu(a);
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Renault Capture");
		a2.setPrecnik(22);
		a2.setSirina(300);
		a2.setVisina(50);
		v.dodajGumu(a2);
		AutoGuma a3 = new AutoGuma();
		a3.setMarkaModel("Renault Capture");
		a3.setPrecnik(19);
		a3.setSirina(200);
		a3.setVisina(61);
		v.dodajGumu(a3);
	
		
		assertEquals(3, v.pronadjiGumu("Renault Capture").size());
	}

	
	
	
	
	
	
	
}