package kadai1;

import java.util.Scanner;

public class CheckInteger1 {

	public static void main(String[] args) {
		// try-with-resourcesを利用する
		try (Scanner scanner = new Scanner(System.in)) {
			// 入力値を取得
			System.out.print("数字を入力してください：");
			int input = scanner.nextInt();
			// 入力値をもとにした処理：入力値の判定
			String judge = "";
			if (input == 7) {
				judge = "大当たり！";
			} else {
				judge = "ハズレ";
			}
			// 処理結果の表示
			System.out.println(judge);
		}
	}

}
