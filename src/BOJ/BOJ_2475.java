package BOJ;

import java.util.Scanner;

public class BOJ_2475 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int sum=0;

        for(int i=0; i<5; i++){
            int a = input.nextInt();
            sum += a*a;
        }

        int n = sum % 10;
        System.out.println(n);

    }
}
