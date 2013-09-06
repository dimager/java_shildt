/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 12.07.13
 * Time: 19:08
 * To change this template use File | Settings | File Templates.
 */
class BreakLoop2 {
    public static void main(String args[]) {
        int i = 0;

        while(i < 100) {
            if(i == 10) break; // terminate loop if i is 10
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Loop complete.");
    }
}
