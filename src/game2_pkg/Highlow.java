package game2_pkg;

public class Highlow {
	int num;
	public void output() {
		this.num = (int) (Math.random() * 10) + 1;
		System.out.println("出た数字:" + this.num);
	}
	public void judge(String t1){
		if(this.num > 5) {
			String ans = "H";
			if(t1.equals(ans)) { System.out.println("あたり!"); }
			else{ System.out.println("ハズレ..."); }
		}else{
			String ans = "L";
			if(t1.equals(ans)) { System.out.println("あたり!"); }
			else{ System.out.println("ハズレ..."); }
		}
	}


}
