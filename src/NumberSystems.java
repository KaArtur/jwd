public class NumberSystems {
    public static void main(String[] args) {

        // system dziesietny 0,1,2,4,5,6,7,8,9
        //154 -> 1 * 10 ^2 + 5 * 10^1 + 4 * 10^0 = 100 + 50 + 4

        // system dwójkowy (binarny) - (0,1)
        //101 ->  (1 *2^2) + (0*2^1) + (1 * 2^0) = 4 + 0 + 1 = 5

        //system ósemkowy (oktalny) (0,1,2,3,4,5,6,7)
        // 47 -> (4*8^1) + (7*8^0) = 32 + 7 = 39

        //system szesnastkowy (hexadecymalny) - (0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f)
        // 3af -> (3*16^2) + (a * 16^1) + (f * 16^0) = 3*256 + 160 + 15 = 943

        System.out.println(Integer.toBinaryString(5));   // 101
        System.out.println(Integer.toOctalString(39));  //47
        System.out.println(Integer.toHexString(943));  // 3af


        // 8  4  2 1
        // 1  0  1 1  = 8 + 0 +2 + 1  = 11
        // int a = 11;
     //   System.out.println(Integer.toBinaryString(a));

        //operatory bitowe
        //& - iloczyn bitowy
        //   | - suma bitowa
        // ^ - XOR
        // >>  - przesuniecie w prawo
        // <<  - przesuniecie w lewo

        int a = 1;   // 0 0 0 1
        int b = 5;   // 0 1 0 1
        //              0 0 0 1

        System.out.println(a & b);   //operacja bitowa

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a&b));


        //XOR
        //1 1 -> 0
        //1 0 -> 1
        //0 1 ->

    }



}
