package Day4;

public class Equals {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals("<") && eq.equals("=")){
            answer = n <= m ? 1 : 0;
        }else if (ineq.equals("<") && eq.equals("!")){
            answer = n < m ? 1 : 0;
        }else if (ineq.equals(">") && eq.equals("=")){
            answer = n >= m ? 1 : 0;
        }else {
            answer = n > m ? 1 : 0;
        }

        return answer;
    }
}


// Review
// ineq == "<" VS ineq.equals("<") : ==은 주소를 비교하고 equals는 내용을 비교한다.
// String str2 = str1; : str1과 str2는 같은 주소를 공유한다.