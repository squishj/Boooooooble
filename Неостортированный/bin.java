import java.util.Arrays;
import java.util.Scanner;

public class bin {
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
        System.out.print("Число которое надо найти(число не должно превышать длинну массива, и само число обозначающее длину): ");
        int find = Hvalchev.nextInt();


        int start = 0;
        int end = len - 1;
        int middle;
        while (start <= end) {
            middle = start + (end - start) / 2;

            if (myArray[middle] == find) {
                System.out.println(middle);
                return;
            }
            if (myArray[middle] > find) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
    }
}