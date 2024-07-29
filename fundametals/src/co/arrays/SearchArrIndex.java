package co.arrays;

public class SearchArrIndex {
	public static int searchIndex(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,7};
		System.out.println(SearchArrIndex.searchIndex(arr, 3));

	}

}
