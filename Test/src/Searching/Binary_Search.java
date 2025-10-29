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
	
	public int searchingElementUsingRecursion(int low,int high,int[] arr,int key) {
		
		int mid = (low+high)/2;
		
		if(arr[mid] == key) 
			return mid;
		else if(arr[mid]<=key) 
			return searchingElementUsingRecursion(mid+1, high, arr, key);
		else
			return searchingElementUsingRecursion(mid, high-1, arr, key);
		
	}
// Duplicate Elements 
	 public int binarysearch(int[] arr, int k) {
	        int low = 0;
	        int high = arr.length - 1;
	        int result = -1;  // to store the first occurrence

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (arr[mid] == k) {
	                result = mid;     // found, but keep searching left
	                high = mid - 1;
	            } else if (arr[mid] < k) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return result;
	    }
	
	
	
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 10 };
		Binary_Search bs = new Binary_Search();
		System.out.println(bs.searchingElement(arr, 10));
		//System.out.println(bs.searchingElementUsingRecursion(0, arr.length-1, arr, 10));
	
	
	}

}
