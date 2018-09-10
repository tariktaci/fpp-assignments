package lab4Q2.good;

public class Rectangle extends ClosedCurve {
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

}
