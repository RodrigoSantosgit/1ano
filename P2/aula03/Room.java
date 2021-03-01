import static java.lang.System.*;

public class Room {
	
	Point bottomleft, topright;
	String type;
	
	public Room (Point p1, Point p2, String tipo) {
		this.bottomleft = p1;
		this.topright = p2;
		this.type = tipo;
	}
	
	public String roomType() {
		return type;	
	}
	public Point bottomLeft() {
		return bottomleft;
	}
	public Point topRight() {
		return topright;
	}
	public Point geomCenter() {
		Point center = new Point(((topright.x()-bottomleft.x())/2),((topright.y()-bottomleft.y())/2));
		return center;
	}
	public double area() {
		return (topright.x()-bottomleft.x())*(topright.y()-bottomleft.y());
	}
}

