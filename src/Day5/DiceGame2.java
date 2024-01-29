package Day5;

public class DiceGame2 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int party1 = a + b + c;
        int party2 = (int)Math.pow(a, 2) + (int)Math.pow(b, 2) + (int)Math.pow(c, 2);
        int party3 = (int)Math.pow(a, 3) + (int)Math.pow(b, 3) + (int)Math.pow(c, 3);

        if((a == b) && (a == c) && (b == c))
            answer = party1 * party2 * party3;
        else if ((a == b) || (a == c) || (b == c))
            answer = party1 * party2;
        else
            answer = party1;

        return answer;
    }
}

// Review
// 항상 한걸음 더 나아가 생각해보자
// 다른사람 풀이 :
//class Solution {
//    public int solution(int a, int b, int c) {
//        int answer = 1;
//
//        int count = 1;
//        if(a == b || a == c || b == c) {
//            count++;
//        }
//
//        if(a == b && b == c) {
//            count++;
//        }
//
//        for(int i = 1; i <= count; i++) {
//            answer *= (pow(a,i)+pow(b,i)+pow(c,i));
//        }
//
//    }
//        return answer;
//
//    private int pow(int a, int b) {
//        if(b == 0) return 1;
//        return a * pow(a, b-1);
//    }
//}