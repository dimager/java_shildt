/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 12.07.13
 * Time: 19:03
 * To change this template use File | Settings | File Templates.
 */
public class ForEach {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // use for-each style for to display and sum the values
        for(int x : nums) {
            System.out.println("Value is: " + x);
            sum += x;
        }

        System.out.println("Summation: " + sum);
    }
}
