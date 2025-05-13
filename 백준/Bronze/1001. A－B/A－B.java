import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // 첫 번째 정수 A 입력
        int B = sc.nextInt(); // 두 번째 정수 B 입력

        System.out.println(A - B); // A - B 결과 출력

        sc.close();
    }
}
