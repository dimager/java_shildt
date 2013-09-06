/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 13.07.13
 * Time: 18:53
 * To change this template use File | Settings | File Templates.
 */
public class BoxDemo5 {
    public static void main (String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.setDim(10,15,20);
        mybox2.setDim(3,6,9);

        System.out.println("Объем равен " + mybox1.volume2());
        System.out.println("Объем равен " + mybox2.volume2());
    }
}
