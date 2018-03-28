import java.util.Scanner;

public class TwentyQuestions {
    static Scanner sc = new Scanner(System.in);

        // You can read user input as follows:
        // boolean answer = sc.nextBoolean();
        public static int search(int min, int max) {
            // Base Case - when min and max are the same integer
            if (/* */) {
                /* */
            } else {
                int mid = /**/;
                System.out.println("Is your number less than " + mid);
                boolean lessThan = sc.nextBoolean();

                if (lessThan) {
                    /* */
                } else {
                    /* */
                }
            }
        }

        public static void main(String[] args) {
            int min = 0;
            int max = 100;
            System.out.println("Think of a number between " + min + " and " + max + ".\nPress Enter to Continue");
            sc.nextLine();
            int answer = search(min, max);


            System.out.println("Your number is " + answer);
        }
}
