package Chapter5;

public class ArrayEx10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10)); // 0~9가 랜덤하게 저장 후 출력
		}
		
		System.out.println();
		//버블정렬
		for(int i=0; i<numArr.length-1; i++) { // n-1번 반복해서 비교한다
			boolean changed = false; // 자리바꿈 발생했는지 체크
			
			for(int j=0; j<numArr.length-1-i; j++) { // 마지막 원소를 정렬 후 비교에서 제외하므로 비교횟수가 1씩 줄어든다
				if(numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true; 
				}
			}
			if(!changed) break; // 자리바꿈이 발생하지 않으면 정렬 완료, 반복문을 벗어난다.
			
			for(int k=0; k<numArr.length; k++) {
				System.out.print(numArr[k]); // 정렬될때마다(1회전마다) 출력
			}
			System.out.println();
		}
	}

}
