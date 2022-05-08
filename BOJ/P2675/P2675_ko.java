import java.util.Scanner;

public class P2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			int R = sc.nextInt(); // 반복횟수
			String S = sc.next(); // 문자열
			int lenS = S.length();
			char now;
			for (int i = 0; i < lenS; i++) {
				now = S.charAt(i);
				for (int j = 0; j < R; j++)
					sb.append(now);
			}
			System.out.println(sb);
			sb.setLength(0); // 스트링빌더 초기화
		}
	}

}
