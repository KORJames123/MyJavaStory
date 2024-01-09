package Day2;

public class SubString {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        answer = my_string.substring(0,s) + overwrite_string;
        if(my_string.length() > answer.length()){
            answer += my_string.substring(answer.length());
        }

        return answer;
    }
}

// Review
// substring(n) : 문자열의 n번째부터 마지막 문자까지만 반환해줌
// substring(a, b) : 문자열의 a부터 b까지의 문자를 반환해줌  예) str = "Hellow"이고 str.substring(0, 2)인 경우 He까지 반환