package BOJ;

import java.util.Scanner;

public class BOJ_5522 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for(int i=0; i<5; i++){
            sum += input.nextInt();
        }

        System.out.println(sum);
    }
}
