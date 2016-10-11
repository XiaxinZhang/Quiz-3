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

	@Test
	public void testArea() throws APException{
		Triangle testTriangle = new Triangle(3.0, 4.0, 5.0);
		assertTrue(testTriangle.getArea() == 6.0);
		assertFalse(testTriangle.getArea() == 7.0);
	}
	
	@Test
	public void testPerimeter() throws APException{
		Triangle testTriangle = new Triangle(3.0, 4.0, 5.0);
		assertTrue(testTriangle.getPerimeter() == 12.0);
		assertFalse(testTriangle.getPerimeter() == 14.0);
	}
	
	@Test
	public void testGetSides() throws APException{
		Triangle testTriangle = new Triangle(3.0, 4.0, 5.0);
		assertTrue(testTriangle.get_side1() == 3.0);
		assertTrue(testTriangle.get_side2() == 4.0);
		assertTrue(testTriangle.get_side3() == 5.0);
	}
	
	@Test(expected = APException.class)
	public void failArea() throws APException {
		Triangle testTriangle = new Triangle (1,5,10);
	}
	
	@Test
	public void testToString(){
		Triangle testTriangle = null;
		try {
			testTriangle = new Triangle(3.0, 4.0, 5.0);
		} catch (APException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expected = "The three sides of Triangle are"+ 3.0 + 4.0 + 5.0 +"\n The Perimeter of the triangle is "+ 12.0 + "\n The Area of the triangel is "+ 6.0;
		assertEquals(testTriangle.toString(), expected);
	}
	

}
