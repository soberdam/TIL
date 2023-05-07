package Chapter6;

public class Exercise6_23 {
	static int max(int[] arr) {
		final int ERROR_NUM = -999999;
		if(arr == null || arr.length == 0) {
			return ERROR_NUM;
		}
		int maxInt = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>maxInt) maxInt = arr[i];
		}
		
		return maxInt;
	}
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
	}
}
