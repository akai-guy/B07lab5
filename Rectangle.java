newpackage lab4;

import java.awt.Point;

public class Rectangle {
	Point A;
	Point B;
	Point C;
	Point D;
	public Rectangle(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}
	
	public boolean isValid() {
		boolean isABC90 = (A.x-B.x)*(C.x-B.x)+(A.y-B.y)*(C.y-B.y) < 1e-9;
		boolean isBCD90 = (B.x-C.x)*(D.x-C.x)+(B.y-C.y)*(D.y-C.y) < 1e-9;
		boolean isBAD90 = (B.x-A.x)*(D.x-A.x)+(B.y-A.y)*(D.y-A.y) < 1e-9;
		return isABC90&&isBCD90&&isBAD90;
	}
	
	public boolean isSquare() {
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCD = C.distance(D);
		double dDA = D.distance(A);
		if(dAB==dBC && dBC==dCD && dCD==dDA)
			return true;
		else
			return false;
	}
}
