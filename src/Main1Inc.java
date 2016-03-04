/**
 * Created by script on 04.03.16.
 */
public class Main1Inc {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               // System.out.print(j + "*" + i + "=" + i * j + "\t\t");
                System.out.printf("%d * %d = %d \t\t",j ,i, i*j );
            }
            System.out.println();
        }
    }
}
