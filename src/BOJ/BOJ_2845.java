package BOJ;

import java.util.Scanner;

public class BOJ_2845 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();
        int P = input.nextInt();
        int S = L * P;

        for(int i=0; i<5; i++){
            int n = input.nextInt();
            System.out.print(n - S + " ");
        }

    }
}
