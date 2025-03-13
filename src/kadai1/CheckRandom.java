package kadai1;

public class CheckRandom {

	public static void main(String[] args) {
		// じゃんけんの手の配列：「0, 1, 2の数をどうやって決定するか？」問題のひとつの解決
		String[] rockPaperScissors = {"グー", "チョキ", "パー"};
		
		// 秒で現在時刻を取得：計算のためにint型にキャストしておくとラク！
		int currentTime = (int) System.currentTimeMillis();
		
		// 乱数による手の決定：配列にして用意しておくことで１行で終わる → 発想の転換が大事！
		String result = rockPaperScissors[currentTime % 3];
		
		// 結果の表示
		System.out.println(result);
	}

}
