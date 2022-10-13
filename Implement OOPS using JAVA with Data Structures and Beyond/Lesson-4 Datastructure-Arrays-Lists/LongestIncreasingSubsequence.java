package dsa;

import java.util.Arrays;
//Dynamic Programming
public class LongestIncreasingSubsequence {
	static int lis(int arr[], int n) {
		int lis[] = new int[n];//int lis[] = new int[arr.length];
		int i, j, max = 0;
		for (i = 0; i < n; i++)
			lis[i] = 1;
		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] &&  lis[j] + 1 > lis[i] )
					lis[i] = lis[j] + 1;
		for (i = 0; i < n; i++)
			if (max < lis[i])
				max = lis[i];

		return max;
	}

	public static void main(String args[]) {
		int arr[] = { 10,25,1,45,80,7,20,10,23};
		//subsequences {10,25},{1,45,80},{10,25,45,80}
		//returns LIS subsequence
		int n = arr.length;
		System.out.println(Arrays.toString(arr)+"\n");
		System.out.println("Length of LIS is " + lis(arr, n) );
	}
}
