package Day5;

public class PlusPlus {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 0; i < included.length; i++){
            boolean flag = included[i];
            if(flag)
                answer += i == 0 ? a : a + i * d;
        }
        return answer;
    }
}

// Review
// .length() VS .length : 괄호가 붙으면 문자열의 길이를 반환하고 괄호가 없으면 배열의 크기를 반환한다.