import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Solution {
    public static void max(double a, double b, double c) {
        double max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            try {
                File file = new File("testcases/Test " + i + ".txt");
                Scanner reader = new Scanner(file);
                while (reader.hasNextDouble()) {
                    double a = reader.nextDouble();
                    double b = reader.nextDouble();
                    double c = reader.nextDouble();
                    System.out.println("Test " + i + ": Input: " + a + " " + b + " " + c);
                    System.out.print("\tOutput: ");
                    max(a, b, c);
                }     
                reader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}