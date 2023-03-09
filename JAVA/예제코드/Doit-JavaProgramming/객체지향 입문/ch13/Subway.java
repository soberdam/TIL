package ch13;

public class Subway {
	private int subwayNumber;
	private int passengersCount;
	private int money;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money){
		this.money += money;
		passengersCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNumber +"번 버스는 승객이 "+ passengersCount + "명이고, 수입은" + money + "원 입니다.");
	}
}
