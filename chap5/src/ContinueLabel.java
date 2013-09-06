/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 12.07.13
 * Time: 19:13
 * To change this template use File | Settings | File Templates.
 */
public class ContinueLabel {
    public static void main(String args[]) {
        outer: for (int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                if(j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}
