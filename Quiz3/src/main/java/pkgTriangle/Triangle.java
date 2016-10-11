package pkgTriangle;

import java.lang.Math;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
		
	}
	
	public Triangle(double side1, double side2, double side3) throws APException {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		double x = this.side1;
		double y = this.side2;
		double z = this.side3;
		double p = (x + y + z) / 2.0;
		if((p * ((p - x) * (p - y) * (p - z))) <= 0){ 
			throw new APException(this);
		}
		else{
			return;
		}
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
		return Math.sqrt(p * ((p - x) * (p - y) * (p - z)));
	}
	
	@Override
	public double getPerimeter() {	
		return this.side1 + this.side2 + this.side3;
	}
	
	
	@Override
	public String toString() {
		return("The three sides of Triangle are"+ side1 + side2 + side3 +"\n The Perimeter of the triangle is "+ getPerimeter() + "\n The Area of the triangel is "+ getArea());
		
	}
	
	
	
}
