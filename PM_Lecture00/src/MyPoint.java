import java.awt.Point;

public class MyPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		Point p1 = new Point(1, 2);
		System.out.println(p1.x + "," + p1.y);

		Point p2 = p1;
		p2.x = 10;
		p2.y = 20;

		System.out.println(p1.x + "," + p1.y);
	}

}
