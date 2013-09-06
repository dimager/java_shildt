/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 15.06.13
 * Time: 10:59
 * To change this template use File | Settings | File Templates.
 */
class BoolTest {
    public static void main(String args[]) {
        boolean b;
        double test = 314159E-05;
        System.out.println(test + " \u3423");
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        // a boolean value can control the if statement
        if(b) System.out.println("This is executed.");

        b = false;
        if(b) System.out.println("This is not executed.");

        // outcome of a relational operator is a boolean value
        System.out.println("10 > 9 is " + (10 > 9));
    }
}
