
public class Rectangle extends Shape{

	double Area;
	double length;
	double width;
	
	public Rectangle(String Color) {
		super(Color);
	}

	@Override
	double calcArea() {
		Area = length * width;
		return Area;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle("Red");
		rect.length = 5;
		rect.width = 10;
		
		rect.DispArea(rect.calcArea());
	}
}