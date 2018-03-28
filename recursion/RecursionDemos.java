class  RecursionDemos {
    /**
     * This method will iteratively print the sum 
     * of all the numbers up to 'n'
     *
     * e.g. getSum(5) = 1 + 2 + 3 + 4 + 5
     *      getSum(5) = 10
     */
    public static int getSum(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * gets sum of all numbers up to n recursively
     *
     * getSumRecursive(5) = 15
     *
     * getSumRecursive(5) = 5 + getSumRecursive(4)
     * getSumRecursive(5) = 5 + 4 + getSumRecursive(3)
     * getSumRecursive(5) = 5 + 4 + 3 + getSumRecursive(2)
     * getSumRecursive(5) = 5 + 4 + 3 + 2 + getSumRecursive(1)
     * getSumRecursive(5) = 5 + 4 + 3 + 2 + 1 + getSumRecursive(0)
     *
     */
    public static int getSumRecursive(int n) {
        if (n == 0) { // base case
            return n;
        } else { // recursive step
            return n + getSumRecursive(n-1);
        }
    }

    /**
     * Factorial
     * 3! = 3 * 2 * 1
     * n! = n * (n-1) * (n-2) ... (1)
     *
     */
    public static int factorial(int n) {
        int product = 1;
        for(int i = 1; i <= n; i++) {
            product = product * i;
        }
        return product;
    }

    /**
     * Calculates the factorial of n RECURSIVELY
     *
     * Remember: BASE CASE FIRST
     *
     * 5! = 120
     */
    public static int factorialRecursive(int n) {
        if (n == 1 ) { // base case
            return n;
        } else {
            return n * factorialRecursive(n-1);
        }

    }

    /**
     * Fibonacci
     *
     * fib(n) = fib(n-1)  + fib(n-2)
     *
     * 1 1 2 3 5 8 13
     *
     * Write a program that finds the nth fibonacci number
     *
     * fib(0)
     * fib(3) = 2
     * fib(4) = 3
     * fib(7) = 13
     *
     * MAKE SURE TO HAVE A BASE CASE (or maybe 2)
     * @param  n
     */
    public static int fib(int n) {
        if (n==0) {return 0;};
        if (n==1) {return 1;};

        return fib(n-1) + fib(n-2);

    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}