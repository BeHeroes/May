import java.util.Scanner;

public class P2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int in;
		for (int i = 0; i < 5; i++) {
			in = sc.nextInt();
			sum += in * in;
		}
		System.out.print(sum % 10);
	}

}
