package BOJ;

import java.util.Scanner;

public class BOJ_15727 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if(a%5 == 0) System.out.println(a/5);
        else System.out.println((a/5)+1);

    }
}
