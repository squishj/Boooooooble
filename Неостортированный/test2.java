import java.util.Arrays;
public class test2 {
    public static void main(String[] args) {
        int[] myArray = new int[]{3, 9, 8, 6, 5, 7, 1, 7, 4, 0, 7, 6, 2, 2, 8, 4};
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
        System.out.println("Отсортированный массив: " + Arrays.toString(myArray));

        int find = 2;
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