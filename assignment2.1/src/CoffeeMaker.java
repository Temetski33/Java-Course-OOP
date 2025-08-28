public class CoffeeMaker {
    private boolean power = false;
    private int coffeeAmount = 0;
    private String coffeeType = "";

    void pressOnOff() {
        power = !power;
    }

    boolean isOn() {
        return power;
    }

    void setAmount(int amount) {
        if (10 <= amount && amount <= 80) {
            coffeeAmount = amount;
        }

    }

    void setType(String type) {
       coffeeType = type;
    }

    int getCoffeeAmount() {
        return coffeeAmount;
    }

    String getCoffeeType() {
        return coffeeType;
    }
}
