package HomeWork;//Есть устройство, на табло которого показывается количество секунд,
// оставшихся до конца рабочего дня.
// Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800»
// (т.е. остаётся 8 часов), когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа),
//а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
//Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
//Итак: требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы
// с информацией о том, сколько полных часов осталось до конца рабочего дня.
//Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//Обьяснение: в переменную n должно записываться случайное (на время тестирования программы)
// целое число из диапазона от 0 до 28800, далее оно должно выводиться на экран
// (для тех, кто понимает в секундах) и на следующей строке (для тех кто не понимает)
// должна выводиться фраза о количестве полных часов, содержащихся в n секундах.

import java.util.Scanner;

public class BadClock {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите оставгееся время - ");
        int n = scan.nextInt();




        if (n / 3600 <= 8 && n / 3600 >= 5) {
            System.out.println("Осталось " + n + " секунд");
            System.out.println("Осталось " + (n / 3600) + " часов");
        } else if (n / 3600 < 5 && n / 3600 >= 2) {
            System.out.println("Осталось " + n + " секунд");
            System.out.println("Осталось " + (n / 3600) + " часа");
        } else if (n / 3600 < 2 && n / 3600 >= 1) {
            System.out.println("Осталось " + n + " секунд");
            System.out.println("Остался " + (n / 3600) + " час");
        } else if (n / 3600 < 1) {
            System.out.println("Осталось " + n + " секунд");
            System.out.println("Осталось менее часа");
        } else if (n < 0 || n > 28800) {
            System.out.println("Вы ввели некоректное число.");
        }
    }
}
