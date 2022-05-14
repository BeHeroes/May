import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		String[] inputs = new String[2];
		while ((input = bf.readLine()) != null) { // 입력이 있을 때까지
			inputs = input.split(" "); // 공백 기준 쪼개서 더하기
			System.out.println(Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]));
		}
	}
}
