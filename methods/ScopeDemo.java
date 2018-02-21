class ScopeDemo {
	public static void printMyX(String x) {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		String x = "Hi";

		printMyX(x); // = printMyX("Hi");
	}
}