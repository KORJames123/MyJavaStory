package Day2Plus;

public class Devide {
    public int solution(int num1, int num2) {
        double answer = 0;
        answer = (double)num1 / num2 * 1000;
        return (int)answer;
    }
}

// Review
// 소수점을 표현하기 위해서는 double형을 사용해야함.
// 연산에서 하나만 double이면 알아서 바뀜.