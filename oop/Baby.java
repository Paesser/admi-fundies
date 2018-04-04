public class Baby {
    String name;
    boolean isMale;
    double weight;
    double loudness;
    int numPoops = 0;

    Baby(String name, boolean isMale, double weight) {
        this.name = name;
        this.isMale = isMale;
        this.weight = weight;
    }

    void sayHi() {
        System.out.println("Hi my name is " +  name);
    }

    void eat(double foodWeight) {
        weight += foodWeight;
        //weight = weight + foodWeight;
    }

    public static void main(String[] args) {
        Baby eminem = new Baby("Slim Shady", true, 5.0);

        System.out.println("Eminem's Weight: " + eminem.weight);

        // Say Hi
        eminem.sayHi();

        // EAT
        eminem.eat(5.0);
        System.out.print("Eminem's Weight after eating: " + eminem.weight);
    }
}
