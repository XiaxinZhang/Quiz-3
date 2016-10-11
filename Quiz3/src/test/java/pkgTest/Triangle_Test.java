package pkgTest;

import pkgTriangle.Triangle;
import pkgTriangle.APException;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test {
	
	Triangle testTriangle = new Triangle(3.0, 4.0, 5.0);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		testTriangle.get_side1();
		testTriangle.get_side2();
		testTriangle.get_side3();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testArea() throws APException {
		assertTrue(testTriangle.getArea() == 6.0);
		assertFalse(testTriangle.getArea() == 7.0);
	}
	
	@Test
	public void testPerimeter() throws APException {
		assertTrue(testTriangle.getPerimeter() == 12.0);
		assertFalse(testTriangle.getPerimeter() == 14.0);
	}

}
