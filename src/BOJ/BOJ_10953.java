package BOJ;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_10953 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringTokenizer st;
        String str;

        int T = input.nextInt();

        for(int i =0; i<T; i++){
            str = input.next();
            st = new StringTokenizer(str,",");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a+b);
        }
    }
}
