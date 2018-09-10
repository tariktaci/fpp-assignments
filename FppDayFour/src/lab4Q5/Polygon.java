package lab4Q5;

public interface Polygon {
	public double[] getArrayOfSides();
	 static double sum(double[] arr) {
		 double sum=0.0;
		 for(double sides:arr) {
			 sum+=sides;
		 }
		return sum;
		 
	 }
	 default double computePerimeter() {
		return sum(getArrayOfSides());
		
	}
}
