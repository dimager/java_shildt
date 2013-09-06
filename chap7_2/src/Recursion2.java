/**
 * Created with IntelliJ IDEA.
 * User: Dmitri
 * Date: 03.09.13
 * Time: 14:48
 * To change this template use File | Settings | File Templates.
 */
public class Recursion2 {
    public static void main (String [] args){
        RecTest ob = new RecTest(10);
        int i;
        for (i=0; i<10; i++) ob.values[i] = i;
        ob.printArray(10);
    }
}
