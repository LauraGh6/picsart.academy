package am.picsartacademy.lesson2;

public class Homework2 {
    public static void main(String[] args) {
        int[] array;
        array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

        }

        System.out.println("Numbers divisible by 5:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                System.out.println(array[i]);

            }
        }



    }
}
