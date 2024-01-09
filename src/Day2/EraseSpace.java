package Day2;

import java.util.Scanner;

public class EraseSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String result1 = a.replaceAll(" ", "");
        String result2 = b.replaceAll(" ", "");

        System.out.print(result1);
        System.out.print(result2);
    }
}

// Review
// replaceAll("a", "b") : replaceAll()은 문자열 a를 b로 변환 해준다.
// replace("a", "b") VS replaceAll("a", "b") : 특수문자를 치환할 때 replace(".", "/")로 하면 정상적으로 변환이 되지만 replaceAll()을 사용할 경우
//                                             .(점)은 모든 문자를 의미하게 된다. 따라서 원하는 결과를 얻지 못할 수 있다.
// replaceFirst("a", "b") : 처음으로 조건을 만족할 때만 치환한다.