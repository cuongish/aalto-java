
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = 1;
        System.out.println("Up to what number? ");
        int b = Integer.parseInt(reader.nextLine());
        
        while (a <= b) {   
            System.out.println(a);
            a++;
        }
    }
}
        // Write your code here
       