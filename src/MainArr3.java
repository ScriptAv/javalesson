import java.util.Arrays;

/**
 * Created by script on 04.03.16.
 */
public class MainArr3 {
    public static void main(String[] args) {
        int[][] cells;
        cells = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cells[j][i]);
            }
            System.out.println();
        }
    }
}
