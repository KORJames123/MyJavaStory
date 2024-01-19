package Day3;

public class Big {
        public int solution(int a, int b) {
            int answer = 0;
            String result1 = a + "" + b;
            String result2 = b + "" + a;

            if(Integer.parseInt(result1) > Integer.parseInt(result2)){
                answer = Integer.parseInt(result1);
            }else if(Integer.parseInt(result1) < Integer.parseInt(result2)) {
                answer = Integer.parseInt(result2);
            }else{
                answer = Integer.parseInt(result1);
            }
            return answer;
        }
}

// Review
// 합연산에 ""가 들어가면 문자열 연산으로 바뀐다.
// Integer.parseInt() : String을 Int로 바꿔준다.
// Integer.toString() : 문자열로도 변경 가능
//
// 이렇게도 가능
// class Solution {
//     public int solution(int a, int b) {
//         return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
//     }
// }