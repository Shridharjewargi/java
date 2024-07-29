package co.arrays;

public class SumOfPairEqual {
	public static void equal(int[] arr,int k) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==k) {
					System.out.println("["+i+","+j+"]");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,6,8};
		SumOfPairEqual.equal(arr, 5);

	}

}
