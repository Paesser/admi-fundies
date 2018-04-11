import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    /*
        Write a function that takes in an int n and returns an Array/ArrayList.
        The function should create int array called nums with 40 elements.
        The array should consist of the numbers from 0 – n
        where each element is 1 more than the last (i.e. n – (n-1) = 10).
     */
    public static ArrayList<Integer> questionOne(){
        int n = 40;
        ArrayList<Integer> l = new ArrayList();

        for (int i = 0; i <= (n * 10); i += 10) {
            l.add(i);
        }

        return l;
    }

    public static void questionTwo() {
        ArrayList<Integer> al = new ArrayList (Arrays.asList(-1, -2, -6, 3, 7, 8, 23, 4, 23, 12, -10));

        // Add 1 to every element of a.
        for (int i = 0; i < al.size(); i++){
            int currentElement = al.get(i);
            al.set(i, currentElement + 1);
        }

        // Copy al1 to al2
        ArrayList<Integer> al2 = new ArrayList();
        for (int i = 0; i < al.size(); i++) {
            int currentElementInaL1 = al.get(i);
            al2.add(currentElementInaL1);
        }

        System.out.print(al2);
    }




    public static void main(String [] args) {
        // System.out.println(questionOne());
        questionTwo();
    }
}

