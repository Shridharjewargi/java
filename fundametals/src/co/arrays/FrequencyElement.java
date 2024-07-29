package co.arrays;

public class FrequencyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int fre = 1;
		int[] arr= {1,1,2,4,4,5};
		for(int i=0;i<arr.length-1;i++) {
				if(arr[i]==fre) {
					count++;
					
				}
		}
		System.out.println(count);

	}

}
