package enshu2_pkg;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff s1 = new Staff();
		s1.name = "山田太郎";
		s1.age = 20;
		
		System.out.println( s1.name);
		System.out.println(s1.age);
		
		System.out.println(s1.nibai(1));
		System.out.println(s1.tasu(1, 2));
		System.out.println(s1.kakeru(1, 2));
	
		
		int[] n = {17,30,8080};
		for(int i =0;i<3;i++) {
			System.out.println(n[i]);
			System.out.println(s1.nibai(n[i]));
		}
		
		for(int a : n) {
			System.out.println(a);
			System.out.println(s1.nibai(a));
		}
		
	}

}
