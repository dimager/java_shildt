/**
 * Created with IntelliJ IDEA.
 * User: Mager
 * Date: 02.09.13
 * Time: 17:50
 * To change this template use File | Settings | File Templates.
 */
public class OverloadDemo {
    void test (){
        System.out.println("Параметры отсутствуют");
    }
   // void test (int a){
   //     System.out.println("a = " + a);
  // }
    void test (int a, int b){
        System.out.println("a = " + a + " b = " + b);
    }
    double test (double a){
        System.out.println("double a = " + a );
        return a*a;
    }

}
