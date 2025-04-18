package Hamburger;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Menu sandwich = new Menu("ハンバーガー",550);
		Menu drink = new Menu("オレンジジュース",150);
		SetMenu setmenu = new SetMenu("ハンバーガーセット", sandwich, drink);
		setmenu.display();
		
	}
	

}
