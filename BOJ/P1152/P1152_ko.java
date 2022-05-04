import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		int ans = str.length;
		int len = str.length;
		for (int i = 0; i < len; i++) 
			if (str[i].equals(""))
				ans--;
		
		System.out.print(ans);
	}
}
