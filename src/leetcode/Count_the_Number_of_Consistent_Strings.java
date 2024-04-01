package leetcode;


public class Count_the_Number_of_Consistent_Strings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            boolean bool= true;
            for (int j = 0; j < str.length(); j++) {
                if(!allowed.contains(""+ str.charAt(j))){
                    bool = false;
                    break;
                }
            }
            if (bool) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
