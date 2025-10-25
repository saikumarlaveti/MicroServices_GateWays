package Searching;

public class Binary_Search {
	public int searchingElement(int[] arr ,int key) {
		int lower = 0;
		int upper = arr.length-1;
		while(lower<=upper) {
			int mid = (lower+upper)/2;
			if(arr[mid] == key) {
				return mid;
			}
			 if(arr[mid] <key) 
				lower = mid+1;
			
			else  
				upper = mid-1;			
		}
		return 0;
	}
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		Binary_Search bs = new Binary_Search();
		System.out.println(bs.searchingElement(arr, 10));
	
	
	
	}

}
