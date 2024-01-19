package Day4;

public class Flag {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        return answer = flag == true ? a + b : a - b;
    }
}

// Review
// flag == true 안해도 됨.
// return answer = flag ? a + b : a - b;