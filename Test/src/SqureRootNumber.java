
public class SqureRootNumber {
	public static int findSquareRoot(int n) {
		int squre = 1;
		while(squre * squre <=n) {
			squre++;
		}
		return squre-1;
	}
//Binary Method
	public static int findSquareRoot1(int number) {
		int res = 1;
		int low = 1,high = number;
		while(low<=high) {
			int mid = (low+high)/2;
			if(mid*mid <= number) {
				res = mid;
				low = mid+1;
			}
			
			//else if(mid*mid >= number) 
			else
				high = mid-1;
		}
		return res;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(SqureRootNumber.findSquareRoot(9));
		System.out.println(SqureRootNumber.findSquareRoot1(9));
		System.out.println(SqureRootNumber.findSquareRoot1(12));
		System.out.println(SqureRootNumber.findSquareRoot1(25));
		System.err.println(Math.sqrt(25)); //built in function
		
	}

}
