package SoloTest.BaekJoon;

import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        HashSet<Integer> a = new HashSet<>();
//        int[] arr = new int[10];

        for(int i=0;i<10;i++){
            a.add(sc.nextInt()%42);
        }
        System.out.println(a.size());
    }
}
