package kadai1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// 入力値の取得
			System.out.print("国語の点数を入力してください：");
			int japanese = scanner.nextInt();
			System.out.print("数学の点数を入力してください：");
			int math = scanner.nextInt();
			System.out.print("英語の点数を入力してください：");
			int english = scanner.nextInt();
			
			// 入力値をもとにした処理
			String judge = "";
			if (japanese >= 80 && math >= 75 && english >= 70) {
				judge = "合格です";
			} else {
				judge = "不合格";
			}
			
			// 処理結果の表示
			System.out.println(judge);
			
		}
	}

}
