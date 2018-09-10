package lab4Q5;

public class Rectangle implements Polygon {
	private double length;
	private double wedth;

	public Rectangle(int i, int j) {
		length = i;
		wedth = j;
	}

	@Override
	public double[] getArrayOfSides() {

		return new double[] { length, length, wedth, wedth };
	}

}
