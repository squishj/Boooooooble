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

        for(int i = 0; i < len; ++i) {
            for(int j = 0; j < len - 1; ++j) {
                if (myArray[j] > myArray[j + 1]) {
                    int tmp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = tmp;
                }
            }
        }
        int find = 4;
        System.out.println(Arrays.toString(myArray));
        int start = 0;
        int end = len - 1;
        int middle;
        while (start <= end) {
            middle = start + (end - start) / 2;

            if (myArray[middle] == find) {
                System.out.println(middle + 1);
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