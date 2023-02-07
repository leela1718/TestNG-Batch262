package classes;

public class WhileService {
	public int findTotalSumOf1to10Numbers() {
		int x = 1;
		int sum = 0;
		while(x <= 10) {
			sum = sum + x;
			++x;
		}
		return sum;
	}
}
