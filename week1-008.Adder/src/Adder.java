
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstnumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondnumber = Integer.parseInt(reader.nextLine());
        double result = firstnumber + secondnumber;
        System.out.print("Sum of the numbers: " + result);
        // Implement your program here. Remember to ask the input from user
    }
}
