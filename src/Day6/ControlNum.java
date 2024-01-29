package Day6;

public class ControlNum {
    public int solution(int n, String control) {
        int answer = 0;
        for(char ch : control.toCharArray()){
            if(ch == 'w')
                n += 1;
            else if(ch == 's')
                n -= 1;
            else if(ch == 'd')
                n += 10;
            else
                n -= 10;
        }

        return answer = n;
    }
}

// Review
// for(char ch : a.toCharArray()) : a의 String문자열을 char문자배열로 바꾸어 주는 메소드 (복습)
// .equals() : String을 비교할 때 사용
// ==을 String을 비교할 때 사용하면 객체의 주소를 비교하지만 Char을 비교할 때 사용하면 값을 비교한다.

// Switch문 사용
//class Solution {
//    public int solution(int n, String control) {
//        int answer = n;
//
//        for(char ch : control.toCharArray()) {
//            switch(ch) {
//                case 'w': answer += 1; break;
//                case 's': answer -= 1; break;
//                case 'd': answer += 10; break;
//                case 'a': answer -= 10; break;
//                default:break;
//            }
//        }
//
//        return answer;
//    }
//}