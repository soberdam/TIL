package ch08;

public class GreedyTest {

	public static void main(String[] args) {
		int coins [] = {500, 100, 50, 10};
		int price = 8370;
		
		int count = 0;
		for(int i=0; i<coins.length; i++) {
			
			count = price/coins[i];
			price = price%coins[i];
			
			System.out.println(coins[i] + "원 짜리 동전의 개수는 " + count + "개 입니다." );
		}
	}

}
