/**
 * Created with IntelliJ IDEA.
 * User: Dmitri
 * Date: 03.09.13
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 */
public class UseStatic {
    static int a = 3;
    static int b;

    static void meth (int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Статический блок инициализирован 222 dfg sdfg sdfg");
        System.out.println("Статический блок инициализирован 222 dfg sdfg sdfg");
        System.out.println("Статический блок инициализирован 222 dfg sdfg sdfg");
        System.out.println("Статический блок инициализирован 222 dfg sdfg sdfg");
        b = a * 4;
    }
    public static void main (String [] args) {
        meth(42);
    }

}
