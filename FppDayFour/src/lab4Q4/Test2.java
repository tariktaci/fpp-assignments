package lab4Q4;

public class Test2 {

	public static void main(String[] args) {

		Polygon[] objects = { new Triangle(4, 5, 6), new Square(3),  new Rectangle(7, 8) };
		// compute areas
		for (Polygon cc : objects) {

			System.out.println("For this " + cc.getClass().getSimpleName() +"\n"+"\t"+"Number of Sides ==>" 
			+cc.getNumberOfSides()+"\n"+"\t"+"Perimeter ==>"+ cc.computePerimeter());

		}

	}

}