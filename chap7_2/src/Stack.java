/**
 * Created with IntelliJ IDEA.
 * User: Dmitri
 * Date: 03.09.13
 * Time: 15:59
 * To change this template use File | Settings | File Templates.
 */
public class Stack {
    private int stck[]= new int[10];
    private int tos;
    Stack (){
        tos = -1;
    }
    void push (int item){
        if(tos == 9) {
            System.out.println("stack is full");
        }
        else {
            stck[++tos] = item;
        }

    }
    int pop() {
        if (tos < 0) { System.out.println("stack is clear");
        return 0;
        }
        else
        return stck[tos--];
    }
}

