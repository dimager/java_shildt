/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 15.06.13
 * Time: 11:42
 * To change this template use File | Settings | File Templates.
 */
class TwoDArray {
    public static void main(String args[]) {
        int twoD[][]= new int[4][5];
        int i, j, k = 0;

        for(i=0; i<4; i++)
            for(j=0; j<5; j++) {
                twoD[i][j] = k;
                k++;
            }

        for(i=0; i<4; i++) {
            for(j=0; j<5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }

    }
}

