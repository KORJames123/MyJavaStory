package Day3;

public class ArrToString {
    public String solution(String[] arr) {
        String answer = "";
        for(String a : arr){
            answer += a;
        }
        return answer;
    }
}

// Review
// for(String a : arr) 여기서 a의 타입을 잘 생각해줄것