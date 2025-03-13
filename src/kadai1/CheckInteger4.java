package kadai1;

import java.util.Scanner;

public class CheckInteger4 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// 入力値を取得
			System.out.print("数字を入力してください：");
			int number = scanner.nextInt();

			/* Example-4：条件の並列-2 */
			// 入力値をもとにした処理
			String judge = number + "は";
			// 正負の判定
			if (number > 0) {
				judge += "正の";
			} else {
				judge += "負の";
			}
			// 偶奇の判定
			if (number % 2 == 0) {
				judge += "偶数";
			} else {
				judge += "奇数";
			}
			judge += "です";
			
//			/* Example-3：条件の並列-1 */
//			// 入力値をもとにした処理
//			String judge = number + "は";
//			if (number > 0 && number % 2 == 0) {
//				judge += "正の偶数";
//			} else if (number > 0 && number % 2 == 1) {
//				judge += "正の奇数";
//			} else if (number < 0 && number % 2 == 0) {
//				judge += "負の偶数";
//			} else {
//				judge += "負の奇数";
//			}
//			judge += "です";
			
//			/* Example-2：条件のネスト例 */
//			// 入力値をもとにした処理
//			String judge = number + "は";
//			if (number > 0) {
//				judge += "正の";
//				if (number % 2 == 0) {
//					judge += "偶数";
//				} else {
//					judge += "奇数";
//				}
//			} else {
//				judge += "負の";
//				if (number % 2 == 0) {
//					judge += "偶数";
//				} else {
//					judge += "奇数";
//				}
//			}
//			judge += "です";
			
//			/* Example-1：条件のネスト例 最も基本的なプログラミング例 */
//			// 入力値をもとにした処理
//			String judge = number + "は";
//			if (number > 0) {
//				if (number % 2 == 0) {
//					judge += "正の偶数です";
//				} else {
//					judge += "正の奇数です";
//				}
//			} else {
//				if (number % 2 == 0) {
//					judge += "負の偶数です";
//				} else {
//					judge += "負の奇数です";
//				}
//			}
			
			// 処理結果の表示
			System.out.println(judge);
		}
	}

}
