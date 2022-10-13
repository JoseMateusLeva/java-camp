package tips.dog;

public class Dog {

    private int size;
    String name;

    public void setSize(int s) { // Encapsulamento
        size = s;
    }

    public int getSize() { // Encapsulamento
        return size;
    }

    void bark(int number) {
        while (number > 0) {
            if (size > 15) {
                System.out.println("Wooof! Woof ... size: " + getSize());
            } else if (size > 10) {
                System.out.println("Wooof! Woof ...size: " + getSize());
            } else {
                System.out.println("Wooof! Woof ... size: " + getSize());
            }

            number = number - 1;
        }
    }
}
