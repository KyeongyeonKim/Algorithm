package BOJ;

import java.util.Scanner;

public class BOJ_3003 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a[] = new int[6];
        int b[] = {1, 1, 2, 2, 2, 8};
        for(int i=0; i<6; i++){
            a[i] = input.nextInt();
        }
        for(int i=0; i<6; i++){
            System.out.print(b[i] - a[i] + " ");
        }
    }
}
