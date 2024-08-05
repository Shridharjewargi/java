package co.arrays;

public class MaxMin {
	public static void checkMaxMin(int[] a) {
		int n =a.length;
		int max=0;
		int min=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}else if(a[i]>0 && a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(max+"  "+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int arr[] = {5,7,8,10,2};
		MaxMin.checkMaxMin(arr);
	}

}
