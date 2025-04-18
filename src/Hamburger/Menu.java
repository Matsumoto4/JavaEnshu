package Hamburger;

public class Menu {
	private String name;
	private int price;
	
	public Menu(String name,int price) {
		this.name = name;
		this.price = price;
		
	}
	public void display() {
		System.out.println(this.name +":"+this.price+"円");
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
