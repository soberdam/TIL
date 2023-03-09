package ch11;

public class Person{
	private String name;
	private int Id;
	public Person(){
		// 이곳에 statement가 올 수 없습니다.
		this("이름없음", 1);
	}
	
	public Person(String name, int Id){
		this.name = name;
		this.Id = Id;
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		
		System.out.println(person.name);
		System.out.println(person.Id);
	}
}