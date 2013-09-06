/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 18.06.13
 * Time: 15:10
 * To change this template use File | Settings | File Templates.
 */
class Ternary {
    public static void main(String args[]) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; // get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);

        i = -10;
        k = i < 0 ? -i : i; // get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);
    }
}

