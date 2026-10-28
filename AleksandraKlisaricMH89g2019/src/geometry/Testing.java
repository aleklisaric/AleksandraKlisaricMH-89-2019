package geometry;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point();
		p1.setX(56); 
		p1.setY(67); //koord (56,67)

		Point p2 = new Point();
		p2.setX(30);
		p2.setY(23); //koord (30,23)
		
		System.out.println(p1.distance(p2)); 
		
		//p1 = 56,67    p2= 30,23
		p1 = p2;
		
		p1.setX(200);
		//200,23
		System.out.println(p2.getX());
	
		p2.setY(100);
		//200,100
		System.out.println(p2.getY());
		
		//p2 = p1;
		
		//vezbe 3
		
		Line l1 = new Line();
		
		l1.setStartPoint(p1);
		l1.setEndPoint(new Point());
		
		System.out.println(l1.getStartPoint());
		System.out.println(l1.getEndPoint());
		System.out.println(l1.getStartPoint().getX());
		
		
		
	}

}
