package pkgTest;

import pkgTriangle.Triangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	Triangle testTriangle = new Triangle(3.0, 4.0, 5.0);
	@Test
	public void testArea() {
		assertTrue(testTriangle.getArea() == 6.0);
	}
	
	@Test
	public void testPerimeter() {
		assertTrue(testTriangle.getPerimeter() == 12.0);
	}

}
