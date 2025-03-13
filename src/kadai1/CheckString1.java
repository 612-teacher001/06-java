package kadai1;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// 入力値を取得
			System.out.print("パスワード：");
			String input = scanner.next();
			// 入力値をもとにした処理
			String result = "";
			if (input.equals("himitu")) {
				result = "一致しました";
			} else {
				result = "一致しませんでした";
			}
			// 処理結果の表示
			System.out.println(result);
		}

	}

}
