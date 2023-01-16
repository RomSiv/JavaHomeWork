package HomeWork;

import java.util.Arrays;

public class FromSmallestToLargestArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int length = arr.length;//получаем размер массива

        for(int i =0; i<length; i++){
            arr[i] = (int)(Math.random() * 99) +10;// рендомные значния масива от 10 до 99
        }
        System.out.println(Arrays.toString(arr));
        boolean flag = true;
        for(int i =1; i<length; i++){
            if(arr[i] <= arr[i-1]){// если следующий элемент больше предыдущего
                flag = false;
                break;//закрываем цикл
            }
        }
    if(flag){
        System.out.println("Последовательный");
    }else{
        System.out.println("Не последовательный");
    }

    }
}
