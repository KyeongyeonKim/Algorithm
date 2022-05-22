package BOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_2338 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BigInteger a = new BigInteger(input.next());
        BigInteger b = new BigInteger(input.next());

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
    }
}
