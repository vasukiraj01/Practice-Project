package dsa;
import java.util.Arrays;

public class Main {

	public static void RotateArrayByone(int arr[]) {
		int x=arr[arr.length-1];
		//rotate 5,1,2,3,4
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=x;
	}
	 public static void rightRotate(int[] arr, int k)
	    {
	        if (k < 0 || k >= arr.length) {
	            return;
	        }
	 
	        for (int i = 0; i < k; i++) {
	            RotateArrayByone(arr);
	        }
	    }
	 public static void main(String[] args)
	    {
	        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
	        int k = 3;
	 
	        rightRotate(arr, k);
	 
	        System.out.println(Arrays.toString(arr));
	    }

}
