package HomeWork;

//сломанный лифт
//лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
//Лифт сломан. Каждый раз он поднимается на N этажей и спускается на M этажей.
//Если на последнем подьеме лифт превысил колличество этажей,
//то считается что лифт поднялся на самый верх.
//Найдите количество подьемов, которые понадобятся лифту.

import java.util.Scanner;

public class BadLift {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Максимальный этаж");
        int floor = scan.nextInt();
        System.out.println("ВВерх на");
        int stepUp = scan.nextInt();
        System.out.println("Вниз на");
        int stepDown = scan.nextInt();
        int counter = 0;


        for (int i = 1; i < floor; i = i + (stepUp - stepDown), counter++) {
            System.out.println("You are on " + i + " floor , step " + counter);
            if (floor - i < stepUp){
            counter++;
                System.out.println("Welcome! You are coming, step " + counter);
            }
        }
    }
}