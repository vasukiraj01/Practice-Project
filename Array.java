package simplelearn;
public class Array{
//1-D array
public static void main(String[] args) {
	
	String[] Names={"Anna","Zen","Roy"};
	for(String d : Names) {
	System.out.println(d);
	}
//2-D Array
	int numbers [][] ={ {25,25,25},{66,45,25},{66,44,87}};
	for(int i=0;i<=2;i++){  
		 for(int j=0;j<=2;j++){  
		   System.out.print(numbers[i][j]+" "); 
		 }
		 System.out.println();
	}
}
}
