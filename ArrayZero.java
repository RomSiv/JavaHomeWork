package HomeWork;

// 1) Создайте массив из 8 случайных целых чисел из интервала [1;50]
//         Выведите массив на экран в строку
//         Замените каждый элемент с нечётным индексом на ноль
//         Снова выведете массив на экран на отдельной строке

import java.util.Arrays;

public class ArrayZero {
    public static void main(String[] args) {


        int[] createArray = new int[8]; // Создаём массив из 8 элементов


        for (int i = 0; i < createArray.length; i++) {
            createArray[i] = (int) (Math.random() * 50) + 1; // Задаём рэндомное значение масиву до 50 от еденицы(+1)
        }
        System.out.println(Arrays.toString(createArray)); //Вывод массива в строчном виде на консоль

        for (int i = 0; i < createArray.length; i++){
            if(i%2 == 1){  //если элемент масива не чётный-
                createArray[i] = 0; //-задаём значению 0
            }
        }
        System.out.println(Arrays.toString(createArray));
    }
}