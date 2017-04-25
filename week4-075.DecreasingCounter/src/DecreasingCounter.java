public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int number;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        number = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
          if(this.value >= 1){
            this.value--;
        }
    }

    // and here the rest of the methods
    public void reset() {
        this.value = 0;
    }
    
    public void setInitial() {
        this.value = this.number;
    }
    
}