package geometry;

public class Rectangle {

	private Point upperLeft;
	private double width;
	private double height;
	private boolean selected;
	
	//metode rand
	public double area () {
		 return height*width;
	}
	
	public double circumference () {
		 return 2*width+2*height;
	}
	
	//get i set
	public Point getUpperLeft() {
		return upperLeft;
	}
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
	
}
