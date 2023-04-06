package ch07;
import java.util.*;

public class TravelTest {
	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 15, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(total);
		customerList.stream().filter(c-> c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
	}
}
