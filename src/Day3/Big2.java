package Day3;

public class Big2 {
    public int solution(int a, int b) {
        int answer = 0;
        return Math.max(Integer.parseInt(a+""+b),(2*a*b));
    }
}