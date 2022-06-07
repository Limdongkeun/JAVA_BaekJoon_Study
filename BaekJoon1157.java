package SoloTest.BaekJoon;

import java.util.Scanner;

public class BaekJoon1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] count = new int[26];

        String str = sc.next().toUpperCase();

        for(int i=0;i<str.length();i++){
            int num = str.charAt(i) -'A';
            count[num]++;
        }
        int max = 0;
        char answer = '?';
        for(int i=0;i< count.length;i++){
            if(max<count[i]){
                max = count[i];
                answer = (char) (i +'A');
            } else if (max == count[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
/*
문자열을 입력받는다
문자열을 잘라서 한글자씩 받는다
받은 수를 센다
가장 많이 나온 단어를 찾아서 대문자로 출력한다
 */