package lab4Q5;

public final class Square  implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	@Override
	public double[] getArrayOfSides() {
		// TODO Auto-generated method stub
		return new double[]{side,side,side,side};
	}
	
	


}
