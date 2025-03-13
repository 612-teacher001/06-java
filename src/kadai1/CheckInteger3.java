package kadai1;

import java.util.Scanner;

public class CheckInteger3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// 入力値を取得
			System.out.print("年齢を入力してください：");
			int age = scanner.nextInt();
			// 入力値をもとにした処理：年齢の範囲検査
			String judge = "";
			if (0 <= age && age <= 130) {
				judge = "正しい年齢です";
			} else {
				judge = "0～130で入力してください";
			}
			// 処理結果の表示
			System.out.println(judge);
		}
	}

}
