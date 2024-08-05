package co.arrays;

public class SubArrSum {
	public static void checkSum(int[] a,int sum) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if((a[i]+a[j]+a[k])==sum) {
						System.out.println(i+" "+j+" "+k);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,20,3,10,5};
		SubArrSum.checkSum(arr, 33);

	}

}
