package enshu2_pkg2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Namae n1 = new Namae();
		n1.setSei("田中");
		System.out.println(n1.getSei());
		n1.setMei("太郎");
		System.out.println(n1.getMei());
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("入力   ＞");	
		String t1 = sc1.nextLine();
		System.out.println(t1);
		sc1.close();
	}

}
