import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int ans = 0;
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
			ans = 1;
		System.out.print(ans);
	}

}
