package co.arrays;

public class MoveArr {
	public static void checkMove(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				System.out.println(a[i]);
			}else {
				System.out.println(a[i]=a[i-1]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-12,11,-13,-5,6,-7,5,-3,-6};
		MoveArr.checkMove(arr);

	}

}
