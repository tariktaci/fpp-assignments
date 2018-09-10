package lab4Q4;

public class Rectangle extends ClosedCurve implements Polygon {
	private double length;
	private double wedth;

	public Rectangle(int i, int j) {
		length = i;
		wedth = j;
	}

	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return length * wedth;
	}

	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		
		return 2*length+2*wedth;
	}

}
