package BOJ;

import java.util.Scanner;

public class BOJ_5554 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        System.out.println((a+b+c+d)/60);
        System.out.println((a+b+c+d)%60);

    }
}
