package co.arrays;

public class MaxNoOf1s {
	public static int checkMax(int[][] arr) {
		int n = arr.length;
		int count = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==1) {
					count++;
				}
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1},{1,1,1,1},{1,1}{1,1,1}};
		System.out.println(MaxNoOf1s.checkMax(a));
	}

}
