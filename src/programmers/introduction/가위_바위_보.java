package programmers.introduction;

public class 가위_바위_보 {
    public static void main(String[] args) {
        String rsp = "2";
        String answer = "";
        // 가위 : 2, 바위 : 0, 보 : 5
        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);
            switch (c) {
                case '2' -> answer += "0";
                case '0' -> answer += "5";
                case '5' -> answer += "2";
            }
        }
        System.out.println("answer = " + answer);
    }
}
