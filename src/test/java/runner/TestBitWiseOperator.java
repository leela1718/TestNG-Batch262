package runner;

public class TestBitWiseOperator {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int k = 30;
		if((++x>y) & (++y<k)) {
			++x;
		} else {
			++y;
		}
		System.out.println(x + "...." + y);
	}
}
