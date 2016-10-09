package pkgTriangle;

import java.lang.Math;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle()
	{
		
	}
	
	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double get_side1()
	{
		return this.side1;
	}
	
	public double get_side2()
	{
		return this.side2;
	}
	
	public double get_side3()
	{
		return this.side3;
	}
	
	@Override
	public double getArea()
	{
		double x = this.side1;
		double y = this.side2;
		double z = this.side3;
		double p = (x + y + z) / 2.0;
		double ssq = p * (p - x) * (p - y) * (p - z);
		return Math.sqrt(ssq);
	}
	
	@Override
	public double getPerimeter()
	{	
		return this.side1 + this.side2 + this.side3;
	}
	
	
	@Override
	public String toString()
	{
		String description = "The triangle has sides " + String.valueOf(side1) + ", " + String.valueOf(side2) + ", and " + String.valueOf(side3) + "./n";
		return description;
	}

}
