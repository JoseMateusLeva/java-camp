package tips.dog;

public class TestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.setSize(9);
        Dog two = new Dog();
        two.setSize(22);
        Dog three = new Dog();
        three.setSize(11);

        one.bark(1);
        two.bark(1);
        three.bark(3);
    }
}
