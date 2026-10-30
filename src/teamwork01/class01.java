package teamwork01;

import java.io.FileInputStream;
import java.util.Scanner;

import javazoom.jl.player.Player;

public class class01 {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);

		String[] questions = {
				"日本（にほん）の しゅと は？",
				"富士山（ふじさん）の 高（たか）さ は？",
				"世界（せかい）で いちばん 人口（じんこう）が 多（おお）い 国（くに）は？",
				"2026 World Cup の チーム数（すう）は？",
				"太陽（たいよう）の まわりを 1年（ねん）で まわる 星（ほし）は？",
				"三浦先生はかっこいいですか？"

		};

		int score = 0;

		System.out.println("===== BRAIN GAME =====");
		System.out.println("ゲーム スタート！");
		playMain();

		for (int i = 0; i < questions.length; i++) {

			System.out.println("もんだい " + (i + 1));
			System.out.println(questions[i]);

			if (i == 0) {

				System.out.println("1. Tokyo（とうきょう）");
				System.out.println("2. Osaka（おおさか）");
				System.out.println("3. Fukuoka（ふくおか）");

				int answer = scan.nextInt();

				if (answer == 1) {
					System.out.println("せいかい！（正解）");
					playCorrect();
					score++;
				} else {
					System.out.println("ざんねん！（残念）");
					playWrong();
				}
			}

			else if (i == 1) {

				System.out.println("1. 4000m");
				System.out.println("2. 3790m");
				System.out.println("3. 3776m");

				int answer = scan.nextInt();

				if (answer == 3) {
					System.out.println("せいかい！（正解）");
					playCorrect();
					score++;
				} else {
					System.out.println("ざんねん！（残念）");
					playWrong();
				}
			}

			else if (i == 2) {

				System.out.println("1. スリランカ");
				System.out.println("2. インド");
				System.out.println("3. ネパール");

				int answer = scan.nextInt();

				if (answer == 2) {
					System.out.println("せいかい！（正解）");
					playCorrect();
					score++;
				} else {
					System.out.println("ざんねん！（残念）");
					playWrong();
				}
			}

			else if (i == 3) {

				System.out.println("1. 50");
				System.out.println("2. 35");
				System.out.println("3. 48");

				int answer = scan.nextInt();

				if (answer == 3) {
					System.out.println("せいかい！（正解）");
					playCorrect();
					score++;
				} else {
					System.out.println("ざんねん！（残念）");
					playWrong();
				}
			}

			else if (i == 4) {

				System.out.println("1. 地球（ちきゅう）");
				System.out.println("2. つき");
				System.out.println("3. 火星（かせい）");

				int answer = scan.nextInt();

				if (answer == 1) {
					System.out.println("せいかい！（正解）");
					playCorrect();
					score++;
				} else {
					System.out.println("ざんねん！（残念）");
					playWrong();
				}
			}

			else if (i == 5) {

				System.out.println("1.はい、とてもかっこいいです。");
				System.out.println("2. いいえ、かっこ悪いです。");
				System.out.println("3.分からないです。");

				int answer = scan.nextInt();

				if (answer == 1) {
					System.out.println("せいかい！（正解）");
					playCorrect();
					score++;
				} else {
					System.out.println("ざんねん！（残念）");
					playWrong();
				}
			}

		}

		System.out.println("===== けっか（結果） =====");
		System.out.println("あなた の 点数（てんすう）: " + score + "/6");

		if (score == 5) {
			System.out.println("脳（のう）マスター！");
			playMaster();

		} else if (score >= 3) {
			System.out.println("よく できました！");
			playGood();

		} else {
			System.out.println("もう いちど チャレンジ！");
			playTryAgain();
		}

		scan.close();
	}

	public static void playCorrect() throws Exception {

		FileInputStream fis = new FileInputStream("シーン切り替え1.mp3");

		Player player = new Player(fis);
		player.play();
	}

	public static void playWrong() throws Exception {

		FileInputStream fis = new FileInputStream("ちゃんちゃん♪2.mp3");

		Player player = new Player(fis);
		player.play();
	}

	public static void playMaster() throws Exception {

		FileInputStream fis = new FileInputStream("ドンドンパフパフ.mp3");

		Player player = new Player(fis);
		player.play();
	}

	public static void playGood() throws Exception {

		FileInputStream fis = new FileInputStream("ジャン！.mp3");

		Player player = new Player(fis);
		player.play();
	}

	public static void playTryAgain() throws Exception {

		FileInputStream fis = new FileInputStream("ボヨヨーン.mp3");

		Player player = new Player(fis);
		player.play();
	}

	public static void playMain() throws Exception {

		FileInputStream fis = new FileInputStream("「心の準備をしないと…！」.mp3");

		Player player = new Player(fis);
		player.play();
	}
}