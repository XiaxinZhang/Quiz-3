package pkgTriangle;

public class APException extends Exception{
	
	private double area;
	
	public APException (double area) {
		
		this.area = area;	
	}
	public double getArea() {
		return area;
	}
}
