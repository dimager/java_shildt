/**
 * Created with IntelliJ IDEA.
 * User: Mager
 * Date: 02.09.13
 * Time: 18:22
 * To change this template use File | Settings | File Templates.
 */
public class Test {
        int a, b;
    Test (int i, int j){
        a = i;
        b = j;
    }
    boolean equals (Test o){
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}
