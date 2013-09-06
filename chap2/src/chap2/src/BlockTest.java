/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 15.06.13
 * Time: 10:42
 * To change this template use File | Settings | File Templates.
 */
class BlockTest {
    public static void main(String args[]) {
        int x, y;

        y = 20;

        // the target of this loop is a block
        for(x = 0; x<10; x++) {
            System.out.println("This is x: " + x);
            System.out.println("This is y: " + y);
            y = y - 2;
        }
    }
}
