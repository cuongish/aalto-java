
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstnumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondnumber = Integer.parseInt(reader.nextLine());
        double result = (double) firstnumber / secondnumber;
        System.out.print("Division: " + firstnumber + "/" + secondnumber + "=" + result);
        // Implement your program here. Remember to ask the input from user.
    }
}
