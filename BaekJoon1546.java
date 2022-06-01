package SoloTest.BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        double[] score = new double[num];

        for(int i=0; i<num; i++){
            score[i] = sc.nextDouble();
        }
        double sum =0;
        Arrays.sort(score);
        for(int i=0;i<score.length;i++) {
            sum += ((score[i] / score[score.length-1]) * 100);
        }
        System.out.println(sum / score.length);
    }
}
