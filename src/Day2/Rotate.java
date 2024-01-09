package Day2;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (char ch : a.toCharArray())
            System.out.println(ch);
    }
}

// Review
// for(int k : List) : List의 값을 하나씩 차례로 꺼내와 k에 입힌다.
// for(char ch : a.toCharArray()) : a의 String문자열을 char문자배열로 바꾸어 주는 메소드