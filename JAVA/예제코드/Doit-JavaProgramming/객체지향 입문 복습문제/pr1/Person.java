package pr1;

public class Person {
	
	public String name;
	public int money;
	
	public Person(){
	
	}
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void buyBeanCoffee(BeanCoffee bcoffee, int money) {
		String message = bcoffee.bewing(money);
		if(message != null) {
			this.money -= money;
			System.out.println(name +"이 " + money + "으로 " + message);
		}
	}
		
	public void buyStarCoffee(StarCoffee scoffee, int money) {
		String message = scoffee.bewing(money);
		if(message != null) {
			this.money -= money;
			System.out.println(name +"이 " + money + "으로 " + message);
		}
	
	}
}
