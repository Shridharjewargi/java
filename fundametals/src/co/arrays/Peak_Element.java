package co.arrays;

public class Peak_Element {
	public static boolean checkAsc(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		} 
		return true;
	}
	public static boolean checkDisasc(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		} 
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
