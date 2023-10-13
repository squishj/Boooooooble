import java.util.Arrays;
import java.util.Scanner;

public class booble {
    public static void main(String[] args) {
        Scanner Hvalchev = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int len = Hvalchev.nextInt();
        int[] myArray = new int[len];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < len; i++) {
            myArray[i] = Hvalchev.nextInt();
        }
        System.out.println("Неотсортированный массив: " + Arrays.toString(myArray));

        for(int i = 0; i < len; ++i) {
            for(int j = 0; j < len - 1; ++j) {
                if (myArray[j] > myArray[j + 1]) {
                    int tmp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = tmp;
                }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(myArray));
    }
}

