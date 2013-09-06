/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 12.07.13
 * Time: 19:07
 * To change this template use File | Settings | File Templates.
 */
public class BreakLoop {
public static void main(String args[]) {
        for(int i=0; i<100; i++) {
        if(i == 10) break; // terminate loop if i is 10
System.out.println("i: " + i);
}
        System.out.println("Loop complete.");
}
        }
