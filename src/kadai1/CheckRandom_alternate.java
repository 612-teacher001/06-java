package kadai1;

import java.util.Random;

public class CheckRandom_alternate {

	public static void main(String[] args) {
		// 乱数の発生：ミリ秒で現在時刻を取得する方法もある（課題では乱数を利用する指示なのでNGだけど）
		Random random = new Random();
		int number = random.nextInt();
		// 乱数による手の決定：0, 1, 2の数をどうやって決定するか？
		String result = "";
		if (number % 3 == 0) {
			result = "グー";
		} else if (number % 3 == 1) {
			result = "チョキ";
		} else {
			result = "パー";
		}
		// 結果の表示
		System.out.println(result);
	}

}
