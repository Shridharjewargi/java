package co.arrays;


public class SumofArrayRec {
	static int sum = 0;
	public static int sumOfArr(int[] arr,int index) {
		if(index == arr.length) {
			return sum;
		}
		sum +=arr[index];
		return sumOfArr(arr,index+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		System.out.println(sumOfArr(arr,0));

	}

}
