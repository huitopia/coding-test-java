package programmers;

import java.util.*;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        List<Integer> list = new ArrayList<>();
        Iterator<Integer> iterator = Arrays.stream(arr).iterator();
        int cnt = 0;
        while (iterator.hasNext()) {
            Integer next = iterator.next();

            if(list.size() == 0){
             list.add(next);
            } else if (list.size() > 0) {
                int getList = list.get(cnt);
                boolean result = getList == next;
                if(!result){
                    list.add(next);
                    cnt++;
                }
            }
        }
        System.out.println("list = " + list);
    }
}
