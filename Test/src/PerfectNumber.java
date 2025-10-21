
public class PerfectNumber {
	public boolean isPerfect(int n) {
		int sum = 1;  // 1 is always a proper divisor

		for (int i = 2; i * i <= n; i++) {
		    if (n % i == 0) {
		        sum += i;
		        if (i != n / i) 
		        	sum += n / i;
		    }
		}
		return sum == n;
	}
	public static void main(String[] args) {
		PerfectNumber pn = new PerfectNumber();
		System.out.println(pn.isPerfect(6));
		System.out.println(pn.isPerfect(12));
		System.out.println("Saikumar Laveti");
}
}
