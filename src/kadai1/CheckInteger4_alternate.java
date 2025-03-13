package kadai1;

import java.util.Scanner;

public class CheckInteger4_alternate {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// 入力値を取得
			System.out.print("数字を入力してください：");
			int number = scanner.nextInt();
			// 入力値をもとにした処理
			String judge = number + "は";
			if (number > 0) {
				if (number % 2 == 0) {
					judge += "正の偶数です";
				} else {
					judge += "正の奇数です";
				}
			} else {
				if (number % 2 == 0) {
					judge += "負の偶数です";
				} else {
					judge += "負の奇数です";
				}
			}
			// 処理結果の表示
			System.out.println(judge);
		}
	}

}
