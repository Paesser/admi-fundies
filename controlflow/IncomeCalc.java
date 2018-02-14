class IncomeCalc {
	public static void main(String[] args) {
		double income = Double.parseDouble(args[0]);
		double rate;
		if (income < 15000) {
			rate = 1;
		} else if (income < 20000) {
			rate = 0.95;
		} else if (income < 25000) {
			rate = 0.90;
		} else if (income < 30000) {
			rate = 0.85;
		} else {
			rate = 0.7;
		}

		double incomeAfterTax = income * rate;
		System.out.println("Your income after tax is: " + incomeAfterTax);
	}
}