package lesson3;

public class ArrayExample {


    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }

            num[0] = 11;
            num[1] = 22;
            num[2] = 33;

        System.out.println();
            for (int i = 0; i < 10; i++) {
                System.out.print(num[i] + " ");

            }
        }
    }


