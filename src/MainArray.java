/**
 * Created by script on 04.03.16.
 */
public class MainArray {
    public static void main(String[] args) {
        int a = 10;
        int[] numbers = {10, 3, 9, 2};
        System.out.println(numbers[3]);
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
