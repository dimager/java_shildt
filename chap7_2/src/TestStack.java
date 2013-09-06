/**
 * Created with IntelliJ IDEA.
 * User: Dmitri
 * Date: 03.09.13
 * Time: 16:06
 * To change this template use File | Settings | File Templates.
 */
public class TestStack {
    public static void main (String[] args){
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i <10; i++) mystack1.push(i);
        for (int i = 10; i <20; i++) mystack2.push(i);
        System.out.println("pop fromn mystack1");
        for (int i = 0; i<10; i++) System.out.println(mystack1.pop());
        System.out.println("pop fromn mystack2");
        for (int i = 0; i < 5; i++) System.out.println(mystack2.pop());

    }
}
