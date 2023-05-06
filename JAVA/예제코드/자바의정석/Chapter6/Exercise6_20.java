package Chapter6;

class Exercise6_20 {
	static int[] shuffle(int[] arr) {
		int tmp = 0;
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*arr.length);
			tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
