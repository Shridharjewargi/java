package co.arrays;

import java.util.Arrays;

public class Sort1s2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,0,1,2,0,2};
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
			}
		}

	}

}
