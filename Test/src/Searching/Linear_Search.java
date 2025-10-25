package Searching;

public class Linear_Search {
public int elementSearch(int[] arr ,int key) {
	for(int i = 0;i<arr.length-1;i++) {
		if(arr[i] == key) {
			return i;
		}
		
	}
	return -1;
}
	public static void main(String[] args) {
	Linear_Search ls = new Linear_Search();
	int[] arr = {1,2,3,4};
	int result = ls.elementSearch(arr, 3);
	if(result>0) {
		System.out.println("Element found at index :"+result );
	}
	else {
		System.out.println("Element not found");
	}
	
}
}
