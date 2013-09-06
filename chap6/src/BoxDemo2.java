/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 13.07.13
 * Time: 17:48
 * To change this template use File | Settings | File Templates.
 */

public class BoxDemo2 {
    public static void main (String args[]){
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    double vol;

    mybox1.depth = 15;
    mybox1.height = 20;
    mybox1.width = 10;


    mybox2.depth = 3;
    mybox2.height = 6;
    mybox2.width = 9;

    vol = mybox1.width * mybox1.height * mybox1.depth;
    System.out.println("Объем равен " + vol);
    vol = mybox2.width * mybox2.height * mybox2.depth;
    System.out.println("Объем равен " + vol);
    }
}
