/**
 * Created by script on 03.03.16.
 */
public class MainSwift {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        if (a > b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int grade = 40;
        switch (grade) {
            case 5:
                System.out.println("best");
                break;
            case 4:
                System.out.println("good");
                break;
            case 3:
                System.out.println("bad");
                break;
            default:
                System.out.println("werwer");
        }
    }
}
