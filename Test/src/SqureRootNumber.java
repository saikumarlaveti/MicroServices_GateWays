
public class SqureRootNumber {
	public static int findSquareRoot(int n) {
		int squre = 1;
		while(squre * squre <=n) {
			squre++;
		}
		return squre-1;
	}
	public static void main(String[] args) {
		System.out.println(SqureRootNumber.findSquareRoot(9));
	}

}
