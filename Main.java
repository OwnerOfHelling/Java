package lesson2;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }

            System.out.println(Arrays.toString(arr));

        }

        emptyArray();
        changeArray();
        diagonalArray();

    }

    public static void emptyArray() {

        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {

            arr2[i] = i * 3;

        }

        System.out.println(Arrays.toString(arr2));

    }

    public static void changeArray() {

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {

            if (arr3[i] < 6) {
                arr3[i] *= 2;
            } else {
                arr3[i] *= 1;
            }

        }

        System.out.println(Arrays.toString(arr3));

    }

    public static void diagonalArray() {

        int[][] arr4 = new int[5][5];
        int lastIndex = arr4.length - 1;
        for (int i = 0; i < arr4.length; i++){

            arr4[i][i] = arr4[i][lastIndex -i] = 1;

        }

        for (int[] ints : arr4) {

            System.out.println(Arrays.toString(ints));

        }

    }
}