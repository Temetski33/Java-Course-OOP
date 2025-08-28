public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker mokkaMaster = new CoffeeMaker();

        mokkaMaster.pressOnOff();
        if (mokkaMaster.isOn()){
            System.out.println("Coffee maker is on");
        } else {
            System.out.println("Coffee maker is off");
        }

        mokkaMaster.setType("espresso");
        System.out.println("Coffee type is " + mokkaMaster.getCoffeeType());

        mokkaMaster.setAmount(50);
        System.out.println("Coffee amount is " + mokkaMaster.getCoffeeAmount() + " ml");

        mokkaMaster.pressOnOff();
        if (mokkaMaster.isOn()){
            System.out.println("Coffee maker is on");
        } else {
            System.out.println("Coffee maker is off");
        }
    }

}
