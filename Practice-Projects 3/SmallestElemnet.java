package dsa;


import java.util.Arrays;

public class SmallestElemnet {
	public static int Sort(int arr[],int k) {
		Arrays.sort(arr);
		return arr[k-1];
		
	}

	public static void main(String[] args) {
		int arr[] = {2,3,8,7,25,6};
		int k=4;
		Sort( arr, k);
		System.out.println("Fourth smallest element:"+Arrays.toString(arr)+" is "+Sort(arr,k) );
		
	}

}
