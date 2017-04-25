import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();
   
public LotteryNumbers() {
        // We'll format a list for the numbers
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        this.numbers = new ArrayList<Integer>();
        int i = 0;
        while (i < 7){
            int randomNumber = random.nextInt(39) + 1;
            if (!this.numbers.contains(randomNumber)){
                this.numbers.add(randomNumber);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
               return this.numbers.contains(number);

    }
}