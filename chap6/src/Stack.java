/**
 * Created with IntelliJ IDEA.
 * User: Mager
 * Date: 02.09.13
 * Time: 17:25
 * To change this template use File | Settings | File Templates.
 */
public class Stack {
    int stck[] = new int [10];
    int tos;
    Stack (){
        tos = -1;
    }
    void push (int item){
        if (tos==9) System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }
     int pop() {
        if (tos<0) {
            System.out.print("Stack is empty");
            return 0;
        }
        else return stck[tos--];
     }
}
