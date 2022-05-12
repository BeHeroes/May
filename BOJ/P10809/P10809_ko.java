import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) 
			sb.append(str.indexOf((char) ('a' + i))+" ");
		
		System.out.print(sb);
	}

}
