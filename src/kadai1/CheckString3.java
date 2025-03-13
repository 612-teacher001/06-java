package kadai1;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// 入力値を取得
			System.out.print("名前：");
			String input = scanner.next(); 
			// 入力値をもとに処理
			String message = "";
			if (input.length() > 20) {
				message = "エラー：20文字以内で入力してください";
			} else {
				message = "ようこそ" + input + "さん";
			}
			// 処理結果の表示
			System.out.println(message);
		}
	}

}
