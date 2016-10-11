package pkgTriangle;

public class APException extends Exception{
	
	private Triangle failedTriangle;
	
	public APException (Triangle triangle) {
		this.failedTriangle = triangle;
		System.out.println("Triange not possible");	
	}
	
}
