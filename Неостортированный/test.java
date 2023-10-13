import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int len = scanner.nextInt();
        int[] myArray = new int[len];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < len; i++) {
            myArray[i] = scanner.nextInt();
        }
        System.out.println("Массив: " + Arrays.toString(myArray));


        int find = 7;
        int start = 0;
        int end = len - 1;
        int middle;
        while (start <= end) {
            middle = start + (end - start) / 2;

            if (myArray[middle] == find) {
                System.out.println(middle );
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