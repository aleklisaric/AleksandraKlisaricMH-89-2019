package geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;
	
	//rand metode
	public double distance(Point p) {
		
		int dx = this.x - p.getX();  //moze bez this ovde
		int dy = this.y - p.getY(); //i ovde
		//this je referenca na objekat koji poziva metodu
		
		System.out.println(dx);
		System.out.println(dy);
		
		return Math.sqrt(dx*dx + dy*dy);
		
	}
	
	//get i set metode
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
