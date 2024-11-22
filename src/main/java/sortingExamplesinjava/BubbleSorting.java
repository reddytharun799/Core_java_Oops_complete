package sortingExamplesinjava;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int arr[] = {33, 22, 23, 2, 233,};
        int lenght = arr.length;
        System.out.println(" before sorting" + Arrays.toString(arr));
         // descending order

        for (int i = 0; i < lenght - 1; i++) {
            for (int j = i; j < lenght - i - 1; j++) {
       /* for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {*/
//                if (arr[j - 1] > arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
               // }
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(" after bubble sorting " + Arrays.toString(arr));



            }
        }
    }
}
