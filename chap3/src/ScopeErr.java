/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 15.06.13
 * Time: 11:23
 * To change this template use File | Settings | File Templates.
 */
class ScopeErr {
    public static void main(String args[]) {
        int bar = 1;
        {              // creates a new scope
            int sdbar = 2; // Compile time error -- bar already defined!
        }
    }
}
