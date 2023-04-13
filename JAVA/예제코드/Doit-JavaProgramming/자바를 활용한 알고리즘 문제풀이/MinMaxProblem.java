
public class MinMaxProblem {

	public static void main(String[] args) {
		int[] arr = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		int min = arr[0];
		int max = arr[0];
		int minPos = 0;
		int maxPos = 0;
		for(int i=1; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
				minPos = i;
			}
			if(max < arr[i]) {
				max = arr[i];
				maxPos = i;
			}
		}
		
		System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + (maxPos+1) + "번째 입니다.");
		System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + (minPos+1) + "번째 입니다.");
	}

}
