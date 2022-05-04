import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int in;
		int max = 0;
		double ans = 0;
		for (int i = 0; i < N; i++) {
			in = sc.nextInt();
			if (max < in) { // 최댓값 갱신
				ans += max;
				max = in;
			} else // 모두 더함
				ans += in;
		}
		System.out.print((ans + max) * 100 / (max * N));
	}

}
