package Lesson2;


public class HomeWorkApp {

    public int[] numberShuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else array[i] = 0;
        }
        return array;
    }

    public int[] arrayFullness(int[] array) {
        int increment = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = increment;
            increment += 3;
        }
        return array;
    }

    public int[] arrayValuesMultipleBySix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

    public int[][] arraySquare(int[][] array) {
        int a = 0;
        int b = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][a] = 1;
                array[i][b] = 1;
            }
            b--;
            a++;
        }
        printArray(array);
        return array;
    }

    public void valueMinMax(int[] array) {
        int min = 1;
        int max = 1;
        for (int item :
                array) {
            if (item < min) min = item;
            if (item > max) max = item;
        }
        System.out.printf("min : %d\nmax : %d\n", min, max);
    }

    public void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public boolean checkBalance(int[] array) {
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            int rightSum = 0;
            for (int j = array.length - 1; j > i; j--) {
                rightSum += array[j];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }

    public int[] arrayStep(int[] array, int step) {
        for (int i = 0; i < step; i++) {
            int temp = 0;
            int nextTemp = 0;
            for (int j = 0; j < array.length; j++) {
                if (j == 0) {
                    temp = array[j];
                    array[j] = array[array.length - 1];
                } else {
                    nextTemp = array[j];
                    array[j] = temp;
                    temp = nextTemp;
                }
            }
        }
        return array;
    }

}
