package Day1;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int n = sc.nextInt();

        System.out.println(str.repeat(n));
    }
}

// Review
// repeat()을 사용하면 반복해서 출력 가능