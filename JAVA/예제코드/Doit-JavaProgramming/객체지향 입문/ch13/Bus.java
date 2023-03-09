package ch13;

public class Bus {
	private int busNumber;
	private int passengersCount;
	private int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money){
		this.money += money;
		passengersCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber +"번 버스는 승객이 "+ passengersCount + "명이고, 수입은" + money + "원 입니다.");
	}
}
