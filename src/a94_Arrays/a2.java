package a94_Arrays;

public class a2 {

	public static void main(String[] args) {

		// 2D array
		
		// declaration
		
   // int [][]a;
   // int[][] a;
  //  int [] [] a;
  //  int a[][];
	
	//  int[] a;    // mostly use
		
		// creation
		
   //   a=new int[3][4];       // [] 1st  = row
                               // [] 2nd  = column
		
		// declaration + creation
		
		int[][] a=new int[3][4];
		
		// initilization
		
		a[0][0]=10;
		a[1][0]=20;
		a[2][0]=30;
	    a[2][3]=120;
	    
	    ///////////////////////
	    
		
		int[][] b= {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
		
		System.out.println(a[2][0]);     // 30
		
		System.out.println(b[2][0]);     // 90
		
	
	}

}
