/**
 * Created with IntelliJ IDEA.
 * User: Mager
 * Date: 02.09.13
 * Time: 18:24
 * To change this template use File | Settings | File Templates.
 */
public class PassOb {
    public static void main (String [] args){
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);
        System.out.println("ob1 and ob2 " + ob1.equals(ob2));
        System.out.println("ob1 and ob3 " + ob1.equals(ob3));
    }
}
