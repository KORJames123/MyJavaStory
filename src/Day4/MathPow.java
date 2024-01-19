package Day4;

public class MathPow {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0){
            for (int i = 2; i <= n; i += 2){
                answer += Math.pow(i, 2);
            }
        }else{
            for (int i = 1; i <= n; i += 2){
                answer += i;
            }
        }
        return answer;
    }
}

// Review
// Math.pow(n, m) : n을 m번 제곱한다.