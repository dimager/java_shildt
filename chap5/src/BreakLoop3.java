/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 12.07.13
 * Time: 19:09
 * To change this template use File | Settings | File Templates.
 */
class BreakLoop3 {
    public static void main(String args[]) {
        for(int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ");
            for(int j=0; j<100; j++) {
                if(j == 10) break; // terminate loop if j is 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loops complete.");
    }
}
