/**
 * Created with IntelliJ IDEA.
 * User: Dmitri
 * Date: 03.09.13
 * Time: 14:45
 * To change this template use File | Settings | File Templates.
 */
public class RecTest {
    int values[];
    RecTest (int i){
        values = new int [i];
    }

    void printArray(int i){
        if (i==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "]" + values[i-1]);
    }
}
