package co.arrays;

public class SortedARR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,3,5};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]);
		}

	}

}
