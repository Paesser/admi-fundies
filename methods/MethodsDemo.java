class MethodsDemo {
	// This is a method called 'printSquare'
	// It takes in 1 argument of type int
	public static int printSquareReturn(int x) {
		return x*x;
	}
	
	public static int printSquare(int x) {
		System.out.println("We are in the function now");
		int result = x * x;
		System.out.println("x * x = " + result);
		return result;
	}

	// This is a method called 'multiply'
	// It takes in 2 arguments of type double each
	public static void multiply(double x, double y) {
		double product = x * y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("x * y = " + product);
	}


	// this is a method called 'main'
	// It takes in 1 argument of type String[]
	public static void main(String[] args) {
		int square = printSquare(2);
		System.out.println("The value of printSquare(2) is: " + square);


		System.out.println(printSquareReturn(2));
		System.out.println(2*3 / 3242);
	}
}