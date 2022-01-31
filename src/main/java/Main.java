import Lesson2.HomeWorkApp;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HomeWorkApp homeWorkApp = new HomeWorkApp();
        int[] array = {1, 0, 0, 1, 0};
        System.out.println(Arrays.toString(homeWorkApp.numberShuffle(array)));
        int[] arrayFullness = new int[8];
        System.out.println(Arrays.toString(homeWorkApp.arrayFullness(arrayFullness)));
        int[] arrayMultiple = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(homeWorkApp.arrayValuesMultipleBySix(arrayMultiple)));
        int[][] arraySquare = new int[10][10];
        homeWorkApp.arraySquare(arraySquare);
        int[] compareArray = {4, 10, 101, 100, 1, 44, 52, 4};
        homeWorkApp.valueMinMax(compareArray);
        int[] checkBalance = {2, 2, 2, 1, 2, 10, 1};
        System.out.println(homeWorkApp.checkBalance(checkBalance));
        int[] arrayForStep = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(homeWorkApp.arrayStep(arrayForStep, 4)));
    }

}
