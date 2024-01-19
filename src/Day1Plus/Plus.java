package Day1Plus;

public class Plus {
    public int solution(int num1, int num2) {
        int answer = 0;
        boolean flag = -50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000;
        if(flag)
            return num1 + num2;
        else
            return answer;
    }
}

// Review
// boolean을 이용해서 num1과 num2의 제한사항을 정의함