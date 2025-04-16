package game1_pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc1 = new Scanner(System.in);
		System.out.println("5より大きいならH、5以下ならLを入力してください >");
		String st1 = sc1.nextLine();
		System.out.println("あなたの入力：" + st1);
		int r1 = (int)(Math.random()*10)+1;
		System.out.println("出た数字:" + r1);
		if(r1 >= 5){
			if(st1.equals("H")) {
				System.out.println("あたり");
			}else {
				System.out.println("ハズレ…");
			}
		}else {
			if(st1.equals("L")) {
				System.out.println("あたり");
			}else {
				System.out.println("ハズレ…");
			}
		}
		sc1.close();
	
	}

}
