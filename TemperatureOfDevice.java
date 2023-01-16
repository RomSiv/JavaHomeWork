package HomeWork;

//Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов,
//а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные Temperature1 и Temperature2.
//В результате он выводит сообщение true или false.

import java.util.Scanner;

public class TemperatureOfDevice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter first temperature - ");
        int temperature1 = scanner.nextInt();
        System.out.println("Please, enter first temperature - ");
        int temperature2 = scanner.nextInt();
        boolean work = true;


        if (work == temperature1>100 && temperature2<100){
            System.out.println("Device is working :" +work);
        }else{
            System.out.println("Device is working :" +!work);
        }
    }
}
