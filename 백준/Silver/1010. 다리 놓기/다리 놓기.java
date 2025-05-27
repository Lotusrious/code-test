import java.util.Scanner; // 사용자 입력을 받기 위한 Scanner 클래스 불러오기

public class Main {

    // M개 중에서 N개를 고르는 조합을 계산하는 함수
    public static int combination(int n, int r) {
        // 예외 처리: 0개 고르거나 전체를 고르면 경우의 수는 1개
        if (r == 0 || r == n) return 1;

        int result = 1;

        // 조합 공식: nCr = n*(n-1)*(n-2)...(n-r+1) / r!
        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
            // 예: C(5, 3) = (5*4*3)/(1*2*3) = 10
        }

        return result; // 조합 결과 리턴
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력을 받기 위한 Scanner 생성

        int T = sc.nextInt(); // 테스트 케이스 개수 입력 받기

        // 테스트 케이스 수만큼 반복
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // 서쪽 다리 사이트 수 (왼쪽)
            int M = sc.nextInt(); // 동쪽 다리 사이트 수 (오른쪽)

            // 조합 함수 호출: M개 중에서 N개를 고름
            int result = combination(M, N);

            // 결과 출력
            System.out.println(result);
        }

        sc.close(); // Scanner 닫기 (메모리 누수 방지)
    }
}
