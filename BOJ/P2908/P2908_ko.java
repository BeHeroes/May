import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine(); // 한 줄 읽기
		StringBuffer sb = new StringBuffer(str);
		String rStr = sb.reverse().toString(); // 뒤집기
		StringTokenizer st = new StringTokenizer(rStr);
		int b = Integer.parseInt(st.nextToken()); // 공백까지 맨 앞에서 자르기
		int a = Integer.parseInt(st.nextToken());

		System.out.print(a > b ? a : b); // 더 큰 숫자 출력
	}

}
