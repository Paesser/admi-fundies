class SquareChange {
	public static void printSquare(int x) {
		System.out.println("printSquare value of x before = " + x);
		x = x * x;
		System.out.println("printSquare value of x after = " + x);
	}



	public static void main(String[] arguments) {
		int x = 5;
		System.out.println("main x = " + x);
		printSquare(x);
		System.out.println("main x = " + x);
	}
}