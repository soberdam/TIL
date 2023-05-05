package Chapter6;

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	double getDistance(int x1, int y1) {
		double d1 = (x1-x)*(x1-x);
		double d2 = (y1-y)*(y1-y);
		double d = Math.sqrt(d1+d2);
		return d;
	}
}

class Exercise6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1, 1);
		// p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));
	}
}
