package kadai1;

import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// 入力値を取得
			System.out.print("色を入力してください：");
			String input = scanner.next();
			// 入力値をもとにした処理
			String result = "";
			
			switch (input) {
			case "red":
				result = "赤です";
				break;
			case "blue":
				result = "青です";
				break;
			case "green":
				result = "緑です";
				break;
			default:
				result = "ほかの色を入力してください";
				break;
			}
			
//			if (input.equals("red")) {
//				result = "赤です";
//			} else if (input.equals("blue")) {
//				result = "青です";
//			} else if (input.equals("green")) {
//				result = "緑です";
//			} else {
//				result = "ほかの色を入力してください";
//			}
			// 処理結果の表示
			System.out.println(result);
		}
	}

}
