package session12.coding_kata.pizza_problem;

public class Pizza {
    private Size size;
    private int cheeseTopping;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(Size size, int cheeseTopping, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getCheeseTopping() {
        return cheeseTopping;
    }

    public void setCheeseTopping(int cheeseTopping) {
        this.cheeseTopping = cheeseTopping;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    public double calcCost() {
        double cost = 0;
        switch (size) {
            case SMALL -> cost += 10;
            case MEDIUM -> cost+=12;
            case LARGE -> cost+=14;
        }
        int totalToppings=cheeseTopping + pepperoniToppings + hamToppings;
        cost += 2 * totalToppings;
        return cost;
    }

    public String getDescription() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("pizza size " + size + "\n");
        if (cheeseTopping > 0) {
            stringBuilder.append(cheeseTopping + " x cheese toppings" + "\n");
        }
        if (pepperoniToppings > 0) {
            stringBuilder.append(pepperoniToppings + " x pepperoni toppings" + "\n");
        }
        if (hamToppings > 0) {
            stringBuilder.append(hamToppings + " x ham toppings" + "\n");
        }
        return stringBuilder.toString();
    }
}
