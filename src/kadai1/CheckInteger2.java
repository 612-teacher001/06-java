package kadai1;

import java.util.Scanner;

public class CheckInteger2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// 入力値を取得
			System.out.print("xの値を入力してください：");
			int x = scanner.nextInt();
			System.out.print("yの値を入力してください：");
			int y = scanner.nextInt();
			// 入力値をもとにした処理
			String judge = "";
			if (x > y) {
				judge = "xはyより大きいです";
			} else if (x  < y) {
				judge = "xはyより小さいです";
			} else {
				judge = "xとyは等しいです";
			}
			// 処理結果の表示
			System.out.println(judge);
		}
	}

}
