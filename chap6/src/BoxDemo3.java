/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 13.07.13
 * Time: 17:55
 * To change this template use File | Settings | File Templates.
 */
public class BoxDemo3 {
   public static void main (String args[]){
       Box mybox1 = new Box();
       Box mybox2 = new Box();

       mybox1.depth = 15;
       mybox1.height = 20;
       mybox1.width = 10;


       mybox2.depth = 3;
       mybox2.height = 6;
       mybox2.width = 9;

       mybox1.volume();
       mybox2.volume();

   }
}
