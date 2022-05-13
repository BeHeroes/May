import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int input;
		for (int i = 0; i < N; i++) {
			input = sc.nextInt();
			min = Math.min(min, input);
			max = Math.max(max, input);
		}
		System.out.print(min + " " + max);
	}

}
