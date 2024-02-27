package programmers.introduction;

import java.util.Arrays;
import java.util.List;

public class 최빈값_구하기 {
    public static void main(String[] args) {
//        최빈값 : 주어진 값 중에서 가장 자주 나오는 값
//        최빈값이 여러 개면 -1 return
        int[] array = {1,2,3,3,3,4};
//        int[] array = {1,1,2,2};
//        int[] array = {1};
        int[] test = new int[array.length];
        int cnt = 0;
        int answer = 0;
        if(array.length == 1) {
            answer = array[0];
        } else {

            for(int i = 0; i < array.length; i++) {
                for(int j = 0; j < i; j++) {
                    if(array[i] == array[j]) {
                        test[cnt] = array[i];
                        cnt++;
                    }
                }
            }

//            if(cnt == 2){
//                answer = -1;
//            }else {
//                answer = test[0];
//            }
            answer = cnt == 2 ? -1 : test[0];

        }
        System.out.println("answer = " + answer);

    }
}
