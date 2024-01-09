package Day1;

import java.util.Scanner;

public class ToUpperAndLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String answer = "";
        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            }else{
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
    }
}

// Review
// charAt(n) : String으로 저장된 문자열 중에서 n번째 글자를 선택하여 char 타입으로 변환하는 메소드
// Character.isUpperCase(n) : n이 대문자인지 판단하여 참과 거짓을 return하는 메소드
// Character.toUpperCase(n) : n을 대문자로 반환하는 메소드 (toLowerCase()일 경우 소문자로 반환)