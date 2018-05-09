package Klironomikotita4;

public class Rectangle extends  GeometricObject{

	

	private int width;
	private int height;
	
	public Rectangle(String color, boolean filled,int w,int h) {
		super(color, filled);
		width=w;
		height=h;
	}

	
	public int getWidth() {
		return width;
	}


	public int getHeight() {
		return height;
	}


	@Override
	public boolean isFilled() {
		if(getFilled ()) {
			return true;
		}else {
		return false;
		}
	}


	@Override
	public double getArea() {

		return getWidth()*getHeight();
	}


	@Override
	public double getPerimiter() {
		return getArea()*2;
	}
	public String toString () {
		return getColor()+" "+getFilled ()+" "+getWidth()+" "+getHeight()+" ";
	}

}
