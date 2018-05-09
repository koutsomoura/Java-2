package Klironomikotita4;

public abstract class GeometricObject {

	private String color;
	private boolean filled;
	
	
	
	public String getColor() {
		return color;
	}
	public boolean getFilled () {
		return filled;
	}
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public abstract boolean isFilled();
	public abstract double getArea();
	public abstract double getPerimiter();
	

}
