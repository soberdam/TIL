package ch14;

import java.util.Scanner;

public class SwitchCaseTest2 {

	public static void main(String[] args) {
		
		int month;
		Scanner scanner = new Scanner(System.in);
		month = scanner.nextInt();
		
		int day = switch(month) {
			case 1,3,5,7,8,10,12 -> {
				yield 31;
			}
			case 2 -> {
				yield 28;
			}
			case 4,6,9,11 -> {
				yield 30;
			}

			default -> {
				System.out.println("존재하지 않는 달입니다");
				yield 0;
			}
		};
		
		System.out.println(month + "월은 " + day +"일까지 있습니다.");
		
	}

}
