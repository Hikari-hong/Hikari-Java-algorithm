package algorithm_chap01;
import java.util.Scanner;
// 4개의 정숫값을 입력후 최솟값을 구함.

class Min4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("네 정수의 최솟값을 구합니다.");
        System.out.print("a의 값 : "); int a = stdIn.nextInt();
        System.out.print("b의 값 : "); int b = stdIn.nextInt();
        System.out.print("c의 값 : "); int c = stdIn.nextInt();
        System.out.print("d의 값 : "); int d = stdIn.nextInt();

        int max = a;
        if (b < max) max = b;
        if (c < max) max = c;
        if (d < max) max = d;

        System.out.println("최솟값은 " + max + "입니다.");
    }
}
