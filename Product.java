package lesson9;

public class Product {
    String product;
    double standartPrice;
    double discount;

    public Product(String product){
        this.product = product;
    }

    public double actualPriceCalculate(){
        double priceWithDiscount = standartPrice * (1 - discount);


        return priceWithDiscount;
    }

    public void printInformation(double priceWithDiscount){
        System.out.println("Product name - " + product);
        System.out.println("Standart price - " + standartPrice);
        System.out.println("Discount - " + discount);
        System.out.println("Price with discount - " + priceWithDiscount);
    }
}
