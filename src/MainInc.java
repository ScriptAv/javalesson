/**
 * Created by script on 04.03.16.
 */
public class MainInc {
    public static void main(String[] args) {
        int i =0;
        int a = i++ + ++i;// 0 + 2
        int ii = 0;
        int aa = ++ii + ii++;// 1 + 1
        System.out.println(a);
        System.out.println(aa);
        /*int i = 0;
        int a = ++i + i++;
        System.out.println(a);

        int ii = 0;
        int aa;
        ii = ii + 1;
        aa = ii +ii;
        System.out.println(aa);*/
    }
}
