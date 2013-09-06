/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 13.07.13
 * Time: 18:09
 * To change this template use File | Settings | File Templates.
 */
public class BoxDemo4 {
    public static void main (String args[]) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.depth = 15;
        mybox1.height = 20;
        mybox1.width = 10;

        mybox2.depth = 3;
        mybox2.height = 6;
        mybox2.width = 9;
        double vol;
        vol = mybox1.volume2();
        System.out.println("Объем равен " + vol);
        vol = mybox2.volume2();
        System.out.println("Объем равен " + mybox2.volume2());
    }
}


