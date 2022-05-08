import java.util.Scanner;

public class P2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int in;
		int idx = 0;
		for (int i = 1; i <= 9; i++) {
			in = sc.nextInt();
			if (max < in) {
				max = in;
				idx = i;
			}
		}
		System.out.println(max);
		System.out.print(idx);
	}

}
