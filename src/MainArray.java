import java.util.Arrays;

/**
 * Created by script on 04.03.16.
 */
public class MainArray {
    public static void main(String[] args) {
        int a = 10;
        int[] numbers = {10, 3, 9, 2};
        char[] g = {'q','w'};
        numbers[1] = 100;
       // numbers[9] = 90;

        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
