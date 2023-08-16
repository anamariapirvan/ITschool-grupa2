package ocaexercises;


class Counter {
    private int value;

    public Counter(int InitialValue) {
        this.value = InitialValue;
    }

    public void IncrementCounter(int amount) {
        value += amount;
    }

    public void DecrementCounter(int amount) {
        value -= amount;
    }

    public void DisplayValue() {
        System.out.println("The current counter value is: " + value);
    }
}

public class CounterClass {
    public static void main(String[] args) {
        Counter counter = new Counter(45);

        counter.IncrementCounter(5);
        counter.DisplayValue();

        counter.DecrementCounter(3);
        counter.DisplayValue();

    }
}

