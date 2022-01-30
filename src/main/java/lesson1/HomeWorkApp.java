package lesson1;

public class HomeWorkApp {

    public void checkSumSing(int a, int b) {
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная"
            );
        }
    }

    public void printThreeWords() {
        String[] words = {"Orange", "Banana", "Apple"};
        for (String word :
                words) {
            System.out.println(word);
        }
    }

    public void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
