/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 15.06.13
 * Time: 10:40
 * To change this template use File | Settings | File Templates.
 */
class IfSample {
    public static void main(String args[]) {
        int x, y;

        x = 10;
        y = 20;

        if(x < y) System.out.println("x is less than y");

        x = x * 2;
        if(x == y) System.out.println("x now equal to y");

        x = x * 2;
        if(x > y) System.out.println("x now greater than y");

        // this won't display anything
        if(x == y) System.out.println("you won't see this");
    }
}
