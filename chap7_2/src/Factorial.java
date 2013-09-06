/**
 * Created with IntelliJ IDEA.
 * User: Dmitri
 * Date: 03.09.13
 * Time: 14:34
 * To change this template use File | Settings | File Templates.
 */
public class Factorial {
int fact (int n){
    int result;
    if (n==1) return 1;
    result = fact(n-1)*n;
    return result;
}
}

