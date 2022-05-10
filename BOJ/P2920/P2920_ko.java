import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ans = { "ascending", "descending", "mixed" };
		int mode = 2;
		int next = 1; // ascending으로 초기화
		int input = sc.nextInt();
		switch (input) {
		case 1:
			mode = 0;
			break;
		case 8:
			mode = 1;
			next = -1;
		}

		for (int i = 1; i < 8 && mode != 2; i++) {
			input += next;
			if (sc.nextInt() != input)
				mode = 2;
		}
		
		System.out.print(ans[mode]);
	}

}
