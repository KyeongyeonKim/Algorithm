package BOJ;

import java.util.Scanner;

public class BOJ_10950 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int a[] = new int[T];
        int b[] = new int[T];;

        for(int i=0; i<T; i++){
            a[i] = input.nextInt();
            b[i] = input.nextInt();
        }
        for(int i=0; i<T; i++) System.out.println(a[i] + b[i]);
    }
}
