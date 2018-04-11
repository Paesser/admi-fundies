import java.util.Random;

public class MethodsPractice {

    /**
     * Returns a string in lowercase
     * @param s String the string to lowercase
     * @return String lowercase string
     */
    public static String stringSimple(String s) {
        String lowerS = s.toLowerCase();
        return lowerS;
    }

    /**
     * Takes in nothing, returns nothing, prints "Tevin"
     */
    public static void printTevin() {
        System.out.println("Tevin");
    }

    /**
     * Takes in a string, returns nothing
     * @param s String - a string
     */
    public static void printString(String s) {
        System.out.print(s);
    }

    public static int returnRandom() {
        Random rand = new Random();
        int randomInt =  rand.nextInt(50) + 1;
        return randomInt;
    }

    public static void main(String args[]) {

        String s = stringSimple("BETT");

        printTevin();

        printString("This is what's going to be printed");

        int random = returnRandom();

    }
}
