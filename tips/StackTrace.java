package tips;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StackTrace {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

