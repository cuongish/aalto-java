import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int until = Integer.parseInt(reader.nextLine());
        int i = 1;
        int factorial = 1;
        while (i <= until) {
            factorial*=i;  // this is the same as result = result + 3;
            i++;          // means the same as i = i+1;
        }
        System.out.println("Factorial is " + factorial);
    }
}