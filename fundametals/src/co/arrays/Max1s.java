package co.arrays;

public class Max1s {
	public static void checkMax(int[][] a) {
		int maxcount=0;
		int rowNumber=-1;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a[i].length;j++) {
				count++;
			}
			if(count>maxcount) {
				maxcount = count;
				rowNumber=i;
			}
		}
		System.out.println("row having maximum count:"+rowNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1},{1,1,1,1},{1,1},{1,1,1}};
		Max1s.checkMax(arr);

	}

}
