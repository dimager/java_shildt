/**
 * Created with IntelliJ IDEA.
 * User: Mager
 * Date: 02.09.13
 * Time: 18:13
 * To change this template use File | Settings | File Templates.
 */
public class Box {
    double width;
    double height;
    double depth;

    Box (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box (){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box (double len){
        width = height = depth = len;
    }
    double volume () {
        return width * height * depth;
    }
    Box (Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

}
