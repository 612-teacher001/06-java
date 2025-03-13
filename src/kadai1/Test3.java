package kadai1;

import java.util.Scanner;

public class Test3 {

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
			int max = 0;
			String subject = "";
			if (japanese > max) {
				max = japanese;
				subject = "国語";
			} else if (math > max) {
				max = math;
				subject = "数学";
			} else {
				max = english;
				subject = "英語";
			}
			
			// 処理結果の表示
			String result = "最高点は" + subject + "で" + max + "点です";
			System.out.println(result);
			
		}
	}

}
