package HomeWork;

//Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того,
//открыты магазины или нет. Реализует логический метод canBuy,,
//возвращающий true ** Значение этой переменной должно быть true,
//если хотя бы один магазин открыт, иначе false.
//Отобразите строку «Я могу купить еду, это ……» и значение.

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ideka is open? true/false");
        boolean isEdekaOpen = scanner.nextBoolean();
        System.out.println("Rewe is open? true/false");
        boolean isReweOpen = scanner.nextBoolean();

        boolean canBuy;

        if (canBuy = isEdekaOpen || isReweOpen){
            System.out.println("Я могу купить еду, это " + canBuy);
        }
    }
}
