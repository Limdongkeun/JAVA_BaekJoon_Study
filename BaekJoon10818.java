package SoloTest.BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] arr = new int[num];
        int max =0;
        int min =0;

        for(int i=0;i<num;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]+ " "+ arr[arr.length-1]);
    }
}
