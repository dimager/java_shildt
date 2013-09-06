/**
 * Created with IntelliJ IDEA.
 * User: Mager
 * Date: 02.09.13
 * Time: 19:15
 * To change this template use File | Settings | File Templates.
 */
public class CallByValue {
    public static void main (String [] args){
    Test2 ob = new Test2();
    int a = 15;
    int b = 20;
    System.out.println("a and b before " + a + " " + b);
    ob.meth(a,b);
    System.out.println("a and b after " + a + " " + b);
    }
}
