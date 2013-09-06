/**
 * Created with IntelliJ IDEA.
 * User: Mager
 * Date: 02.09.13
 * Time: 17:54
 * To change this template use File | Settings | File Templates.
 */
public class Overload {
    public static void main (String[] args){
        OverloadDemo ob = new OverloadDemo();
        double result;
        ob.test();
       // ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("ob.test(123.25) = " + result);
        int i = 88;
        System.out.println("---------------");
        System.out.println(ob.test(i));
    }
}
