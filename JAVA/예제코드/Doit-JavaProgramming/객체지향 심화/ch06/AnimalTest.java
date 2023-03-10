package ch06;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {
	
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 날아갑니다.");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.add(hAnimal);
		animals.add(tAnimal);
		animals.add(eAnimal);
		
		for(Animal ani : animals) {
			ani.move();
		}
		
		animalMove(hAnimal);
		animalMove(tAnimal);
		animalMove(eAnimal);
		
		testDownCasting(animals);
		
	}
	
	public static void animalMove(Animal animal) {
		animal.move();
	}
	
	public static void testDownCasting(ArrayList<Animal> animals) {
		
		for(int i=0; i<animals.size(); i++) {
			
			Animal animal = animals.get(i);
			if( animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
		}
		
	}

}
