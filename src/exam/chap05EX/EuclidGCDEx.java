package exam.chap05EX;// 연습5-2
// 유클리드 호제법에 의해 최대 공약수를 비재귀적으로 구합니다

import java.util.Scanner;

class EuclidGCDEx {

	//--- 정숫값x, y의 최대 공약수를 비재귀적으로 구하여 반환 ---//
	static int gcd(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("두 정수의 최대 공약수를 구합니다.");

		System.out.print("정수를 입력하세요 : ");   int x = stdIn.nextInt();
		System.out.print("정수를 입력하세요 : ");   int y = stdIn.nextInt();

		System.out.println("최대 공약수는 " + gcd(x, y) + "입니다.");
	}
}

