package Test4;

public class Print_2D_Array {
  
//	    Input format :
//		Line 1 : No of rows (n) and no of columns (m) (separated by single space)
//		Line 2 : Row 1 elements (separated by space)
//		Line 3 : Row 2 elements (separated by space)
//		Line 4 : and so on
//		Sample Input 1:
//		3 3
//		1 2 3
//		4 5 6
//		7 8 9
//		Sample Output 1 :
//		1 2 3
//		1 2 3
//		1 2 3
//		4 5 6
//		4 5 6
//		7 8 9
	
public static void print2DArray(int arr[][]) {
		
        int row = arr.length;
        int col = arr[0].length;
        
        
              int k = row;
        for(int i=0; i <row; i++){
            
            for(int l = k-1; l>=0; l--){
                for(int j =0; j<col;  j++){
                    
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println();

            }
            
            k--;
        }

	}
}
