import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // A를 double로 형변환하여 정밀한 나눗셈 수행
        double result = (double) A / B;

        // 출력: 자동으로 소수점 이하 표현, 오차 10^-9 이하
        System.out.println(result);

        scanner.close();
    }
}
