package BOJ;

import java.util.Scanner;

public class BOJ_15964 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();

        System.out.println((a+b)*(a-b));
    }
}
