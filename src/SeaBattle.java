import java.util.Scanner;

/**
 * Created by script on 04.03.16.
 */
public class SeaBattle {
    public static void main(String[] args) {
        char[] cells = new char[10];
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }

        int position = 4;
        cells[position] = 'x';

        for (char cell : cells) {
            System.out.println(cell);
        }

        do{
            System.out.println(cells);
            Scanner sca = new Scanner(System.in);
            String s;
            s = sca.nextLine();
            System.out.printf("вы ввели: %s\n", s);

        }while (cells[position] == 'x');
    }
}

