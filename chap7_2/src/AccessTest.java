/**
 * Created with IntelliJ IDEA.
 * User: Dmitri
 * Date: 03.09.13
 * Time: 15:55
 * To change this template use File | Settings | File Templates.
 */
public class AccessTest {
    public static void main (String [] args){
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;

        // ob.c = 100

        ob.setc(100);
        System.out.println(ob.a + "\n" + ob.b + "\n" + ob.getc() );

    }
}
