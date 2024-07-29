package co.arrays;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{21,22},{24,},{27,28,29}};
		System.out.println(arr[2][2]);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("_____________________________________________");
//		datatype[][] name = new dataType[size][col];
		int[][] arr2 = new int[3][4];

	}

}
