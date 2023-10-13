import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int[] myArray = new int[]{4, 2, 7, 1, 5, 4,2};
        int len = myArray.length;
        System.out.println(Arrays.toString(myArray));

        for(int i = 0; i < len; ++i) {
            for(int j = 0; j < len - 1; ++j) {
                if (myArray[j] > myArray[j + 1]) {
                    int tmp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
        int find = 7;
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