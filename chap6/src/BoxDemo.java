/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 13.07.13
 * Time: 17:42
 * To change this template use File | Settings | File Templates.
 */
class Box {
    double width;
    double height;
    double depth;
    void volume () {
       System.out.println("Объем равен " + width*height*depth);
    }
    double volume2(){
       return width*height*depth;
    }
    void setDim (double w, double h, double d){
        height = h;
        width = w;
        depth = d;
    }
    Box (){
        System.out.println("Box done!");
        width = 10;
        height = 10;
        depth = 10;
    }
    Box (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
public class BoxDemo  {
    public static void main (String args[]){
     Box mybox = new Box();
     double vol;
        mybox.depth = 15;
        mybox.height = 20;
        mybox.width = 10;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}
