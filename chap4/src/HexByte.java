/**
 * Created with IntelliJ IDEA.
 * User: Mager Dmitry
 * Date: 15.06.13
 * Time: 16:03
 * To change this template use File | Settings | File Templates.
 */
class HexByte {
    static public void main(String args[]) {
        char hex[] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1;

        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    }
}