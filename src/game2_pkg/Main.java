package game2_pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc1 = new Scanner(System.in);
		System.out.println("5より大きいならH、5以下ならLを入力してください >");
		String st1 = sc1.nextLine();
		System.out.println("あなたの入力：" + st1);
		
		Highlow h1 = new Highlow();
		h1.output();
		h1.judge(st1);
		
		sc1.close();
	}

}
