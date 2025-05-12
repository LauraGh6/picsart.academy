package am.picsartacademy.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        //version1 of creating an arrey
        int[] arrey;
        arrey = new int[10];
        arrey[0]=10;
        arrey[1]=20;
        arrey[2]=30;
        arrey[3]=40;
        arrey[4]=10;
        arrey[6]=10;
        arrey[7]=10;
        arrey[8]=10;
        arrey[9]=10;

        //version 2 of creating an arrey
        int[] array2 = {10,20,30,40,50,60,70,80,90,100};

        //version 3 off creating an arrey
        int[] arrey3 = new int[10];
        for (int i=0; i < arrey3.length; i++) {
            System.out.println("setting value for index" + i + " where value is" + (i + 1)) ;
            arrey3[i] = i +1;

        }


        int[] arrey4 = {9, 67, 44, -58, 8, 47, 38, 28, 99};
        for (int i = 0; i < arrey4.length; i++) {
            if (arrey4[i] % 2 == 0) {
                System.out.println("Even number: " + arrey4[i]);
            } else {
                System.out.println("Odd number; " + arrey4[i]);

            }
        }



    }
}





