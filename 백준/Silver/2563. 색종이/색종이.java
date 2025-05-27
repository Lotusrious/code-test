import java.util.Scanner; // Scanner 클래스로 입력을 받기 위해 가져옵니다.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);         // Scanner 객체 생성

        int N = sc.nextInt();                        // 붙일 색종이의 개수를 입력받음
        int[][] paper = new int[100][100];           // 도화지(100×100)를 2차원 배열로 생성, 초기값 0

        // 색종이 개수만큼 반복하며
        for (int t = 0; t < N; t++) {
            int x = sc.nextInt();                    // 색종이 왼쪽 아래 모서리의 x좌표 입력
            int y = sc.nextInt();                    // 색종이 왼쪽 아래 모서리의 y좌표 입력

            // 색종이 크기 10×10이므로, 해당 범위만 1로 표시
            for (int i = x; i < x + 10; i++) {       // 가로 방향으로 x부터 x+9까지
                for (int j = y; j < y + 10; j++) {   // 세로 방향으로 y부터 y+9까지
                    paper[i][j] = 1;                 // 색종이가 덮인 부분을 1로 표시
                }
            }
        }

        int area = 0;                                // 색종이가 덮인 총 면적을 저장할 변수

        // 도화지 전체를 탐색하며
        for (int i = 0; i < 100; i++) {              // 가로 인덱스 0부터 99까지
            for (int j = 0; j < 100; j++) {          // 세로 인덱스 0부터 99까지
                if (paper[i][j] == 1) {              // 해당 칸이 1이면(색종이가 덮였으면)
                    area++;                          // 면적 1 증가
                }
            }
        }

        System.out.println(area);                    // 최종 면적 출력
        sc.close();                                  // Scanner 닫기
    }
}
