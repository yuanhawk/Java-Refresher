package Rectangle;

import java.text.NumberFormat;

public class Rectangle {

	private double length, width;

	public Rectangle() {
		length = 0;
		width = 0;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public String getArea() {
		double area = length * width;
		String areaFormatted = NumberFormat.getNumberInstance().format(area);
		return areaFormatted;
	}
	
	public String getPerimeter() {
		double perimeter = 2 * length + 2 * width;
		String perimeterFormatted = NumberFormat.getNumberInstance().format(perimeter);
		return perimeterFormatted;
	}
	
}
