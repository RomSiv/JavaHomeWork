package lesson9;

public class ProduktDemo {
    public static void main(String[] args) {

        Product productMilk = new Product("Milk");
        productMilk.standartPrice = 1.5;
        productMilk.discount = 0.1;

        productMilk.printInformation(productMilk.actualPriceCalculate());

    }
}
