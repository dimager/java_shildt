/**
 * Created with IntelliJ IDEA.
 * User: Mager
 * Date: 02.09.13
 * Time: 17:30
 * To change this template use File | Settings | File Templates.
 */
public class TestStack {
    public static void main (String [] args){
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++)
        // {
            mystack1.push(i);
        //System.out.println("tos = " + mystack1.tos);}
        for (int i = 10; i <20; i++) mystack2.push(i);

        System.out.println("znachenie " + mystack1.stck[2]);
        System.out.println("Stack in mystack 1: ");
        for (int i = 0; i < 10; i++) System.out.println(mystack1.pop() + " and  tos " + mystack1.tos);
        System.out.println("Stack in mystack 2: ");
        for (int i = 0; i < 10; i++) System.out.println(mystack2.pop());


 }
}