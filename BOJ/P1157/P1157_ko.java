import java.util.Scanner;

public class P1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str = sc.next().toUpperCase().toCharArray();
		int len = str.length;
		int[] nums = new int[27]; // 알파벳은 26개 (a~z -> 0~25)
		int max = 26; // 사용하지 않는 인덱스로 초기화
		boolean find = true;
		
		for (int i = 0; i < len; i++) // 개수 세기
			nums[str[i] - 'A']++;

		for (int i = 0; i < 26; i++) {
			if (nums[i] > nums[max]) { // 새로운 최댓값 찾았다면
				find = true;
				max = i; // 알파벳 인덱스 저장
			} else if (nums[i] == nums[max]) // 최댓값인게 여러 개면
				find = false;
		}

		if (find) // 최댓값 찾았다면
			System.out.printf("%c", max + 'A');
		else
			System.out.print('?');
	}

}
