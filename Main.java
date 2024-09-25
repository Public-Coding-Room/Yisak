package example;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 정수의 개수 N 입력
		System.out.print("정수의 개수 N을 입력하세요: ");
		int N = scanner.nextInt();
		
		// 배열 A 입력
		int[] A = new int[N];
		System.out.print(N + "개의 정수를 입력하세요: ");
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}
		
		// 찾고자 하는 정수 x 입력
		System.out.print("찾고자 하는 정수 x를 입력하세요: ");
		int X = scanner.nextInt();
		
		// 결과 확인
		if (containsX(A, X)) {
			System.out.println(X + "는 배열에 존재합니다.");
		} else {
			System.out.println(X + "는 배열에 존재하지 않습니다.");
		}
		
		scanner.close();
	}

	// X가 배열 A에 존재하는지 확인하는 메서드
	private static boolean containsX(int[] a, int x) {
		for(int num : a) {
			if (num == x) {
				return true;
			}
		}
		return false;
	}

}
