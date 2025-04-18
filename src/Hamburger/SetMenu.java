package Hamburger;

public class SetMenu {
	private String name;
	private Menu drink;
	private Menu sandwich;

	public SetMenu(String name,Menu sandwich,Menu drink) {
		this.name = name;
		this.sandwich = sandwich;
		this.drink = drink;
		
		
	}
	
	public void display() {
		System.out.println(this.name);
		System.out.println("---");
		this.sandwich.display();
		this.drink.display();
		int total = this.sandwich.getPrice() + this.drink.getPrice();
		System.out.println("---");		
		System.out.println("通常価格:"+ total +"円");
		double dsettotal = total * 0.8;
		int settotal = (int) dsettotal;
		System.out.println("合計金額："+ settotal + "円(20％引き)");
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
	public Menu getSandwich() {
		return sandwich;
	}
	public void setSandwinch(Menu sandwich) {
		this.sandwich = sandwich;
	}
	public Menu getDrink() {
		return drink;
	}
	public void setDrink(Menu drink) {
		this.drink = drink;
	}
	

}
