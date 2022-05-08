import java.util.Scanner;

public class P2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt() * sc.nextInt() * sc.nextInt();
		int[] ans = new int[10];
		while (num > 0) {
			ans[num % 10]++;
			num /= 10;
		}
		for(int i =0; i<10; i++)
			System.out.println(ans[i]);
	}

}
