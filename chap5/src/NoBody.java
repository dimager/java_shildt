/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 12.07.13
 * Time: 18:52
 * To change this template use File | Settings | File Templates.
 */
class NoBody {
    public static void main(String args[]) {
        int i, j;

        i = 100;
        j = 200;

        // find midpoint between i and j
        while(++i < --j) ; // no body in this loop

        System.out.println("Midpoint is " + i);
    }
}
