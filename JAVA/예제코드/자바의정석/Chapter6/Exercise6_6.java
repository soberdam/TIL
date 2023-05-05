package Chapter6;

class Exercise6_6 {
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		double d1 = (x1-x)*(x1-x);
		double d2 = (y1-y)*(y1-y);
		double d = Math.sqrt(d1+d2);
		return d;
	}
	public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
	}
}
