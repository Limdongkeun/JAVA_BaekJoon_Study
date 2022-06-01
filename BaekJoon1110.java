package SoloTest.BaekJoon;

import java.util.Scanner;

public class BaekJoon1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count=0;
        int copy = num;

        while (true){
            num = ((num%10) * 10) + (((num/10) + (num%10)) % 10);
            count++;

            if (copy ==num){
                break;
            }
        }
        System.out.println(count);
    }
}
