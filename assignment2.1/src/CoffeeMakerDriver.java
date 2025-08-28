public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker mokkaMaster = new CoffeeMaker();

        mokkaMaster.pressOnOff();

        mokkaMaster.setType("espresso");

        mokkaMaster.setAmount(50);

        mokkaMaster.pressOnOff();
    }
}
