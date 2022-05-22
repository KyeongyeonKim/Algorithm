package BOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_1271 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BigInteger n = new BigInteger(input.next());
        BigInteger m = new BigInteger(input.next());

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}
