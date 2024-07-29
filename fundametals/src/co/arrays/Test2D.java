package co.arrays;

public class Test2D {
	public static void rowWiseSum(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			System.out.println(i+"row:"+sum);
		}

	}
	public static void colWisesum(int[][] arr) {
		int i,j;
		int sum=0;
		for(i=0;i<arr.length;i++) {
			for(j=0;i<arr[i].length;j++) {
			sum+=arr[i][arr[i].length];
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{21,22,23},{31,32,33}};
		Test2D.colWisesum(arr);
		
	}

}
