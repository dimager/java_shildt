/**
 * Created with IntelliJ IDEA.
 * User: Mager
 * Date: 02.09.13
 * Time: 17:13
 * To change this template use File | Settings | File Templates.
 */
public class BoxDemo7 {
    public  static void  main ( String [] args){
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;

        vol = mybox1.volume2();
        System.out.println("Объем равен = " + vol);


        vol = mybox2.volume2();
        System.out.println("Объем равен = " + vol);
    }
}
