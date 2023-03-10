package pr1;

public class CoffeeTest {

	public static void main(String[] args) {
		StarCoffee sCoffee = new StarCoffee();
		BeanCoffee bCoffee = new BeanCoffee();
		
		Person personKim = new Person("Kim", 10000);
		Person personLee = new Person("Lee", 20000);
		
		personKim.buyStarCoffee(sCoffee, Menu.STARAMERICANO);
		personLee.buyBeanCoffee(bCoffee, Menu.BEANLATTE);
	}

}
