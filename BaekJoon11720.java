package SoloTest.BaekJoon;

import java.util.Scanner;

public class BaekJoon11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num =sc.nextInt();
        String a = sc.next();

        long sum=0;
        for (int i=0; i<num;i++){
            sum += a.charAt(i) -'0';
        }
        System.out.println(sum);

    }
}
