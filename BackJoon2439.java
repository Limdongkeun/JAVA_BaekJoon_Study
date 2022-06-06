package SoloTest.BaekJoon;

import java.util.Scanner;

public class BackJoon2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=0; i<num;i++){
            for(int j=num-1;j>=0;j--){
                if(i<j){
                    System.out.print("?");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
