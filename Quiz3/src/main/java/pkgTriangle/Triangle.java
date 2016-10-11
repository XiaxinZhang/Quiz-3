package pkgTriangle;

import java.lang.Math;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
		
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double get_side1() {
		return this.side1;
	}
	
	public double get_side2() {
		return this.side2;
	}
	
	public double get_side3() {
		return this.side3;
	}
	
	@Override
	public double getArea() {
		double x = this.side1;
		double y = this.side2;
		double z = this.side3;
		double p = (x + y + z) / 2.0;
		double ssq = p * (p - x) * (p - y) * (p - z);
		return Math.sqrt(ssq);
	}
	
	@Override
	public double getPerimeter() {	
		return this.side1 + this.side2 + this.side3;
	}
	
	
	@Override
	public String toString() {
		System.out.println("The three sides of Triangle are"+ side1 + side2 + side3);
		System.out.println("\n The Perimeter of the triangle is "+ getPerimeter());
		System.out.println("\n The Area of the triangel is "+ getArea());
		return null;
		
	}
	
	public void CheckArea (double area) throws APException {
		if (area <= 0) {
			System.out.println("Does not meet the requirement!");
		} 
		else {
			double checkarea = getArea();
			throw new APException(checkarea);
		}
	}
	
}
