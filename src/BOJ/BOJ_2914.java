package BOJ;

import java.util.Scanner;

public class BOJ_2914 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int avg = input.nextInt();

        int i = num*(avg-1) + 1;
        System.out.println(i);
    }
}