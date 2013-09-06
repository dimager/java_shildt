/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 15.06.13
 * Time: 11:16
 * To change this template use File | Settings | File Templates.
 */
class DynInit {
    public static void main(String args[]) {
        double a = 3.0, b = 4.0;

        // c is dynamically initialized
        double c = Math.sqrt(a * a + b * b);


        System.out.println("Hypotenuse is " + c);
    }
}
