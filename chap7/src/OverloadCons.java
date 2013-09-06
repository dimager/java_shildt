/**
 * Created with IntelliJ IDEA.
 * User: Mager
 * Date: 02.09.13
 * Time: 18:16
 * To change this template use File | Settings | File Templates.
 */
public class OverloadCons {
    public static void main (String args []){
        Box mybox1 = new Box (10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;
        vol = mybox1.volume();
        System.out.println("ОБъем mybox1 = " + vol);
        vol = mybox2.volume();
        System.out.println("ОБъем mybox2 = " + vol);
        vol = mycube.volume();
        System.out.println("ОБъем mycube = " + vol);
    }
}
