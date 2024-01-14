package Programmers_Algorithm;

import java.util.Scanner;

public class Dicegame1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int answer = solution(a, b);
        System.out.println(answer);
    }

    public static int solution(int a, int b) {
        int answer = 0;
        if ((a == 1 || a == 3 || a == 5) && (b == 1 || b == 3 || b == 5)) {
            answer = a * a + b * b;
        } else if ((a == 1 || a == 3 || a == 5) || (b == 1 || b == 3 || b == 5)) {
            answer = 2 * (a + b);
        } else {
            answer = Math.abs(a - b);
        }

        return answer;
    }
}
