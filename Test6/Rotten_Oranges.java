package Test6;

import java.util.Scanner;

public class Rotten_Oranges{

    static int R = 3;
static int C = 5;
  

static boolean issafe(int i, int j)
{
    if (i >= 0 && i < R &&
        j >= 0 && j < C)
        return true;
         
    return false;
}
  
static int rotOranges(int v[][])
{
    boolean changed = false;
    int no = 2;
     
    while (true)
    {
        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                 
             
              
                if (v[i][j] == no)
                {
                    if (issafe(i + 1, j) &&
                             v[i + 1][j] == 1)
                    {
                        v[i + 1][j] = v[i][j] + 1;
                        changed = true;
                    }
                    if (issafe(i, j + 1) &&
                             v[i][j + 1] == 1)
                    {
                        v[i][j + 1] = v[i][j] + 1;
                        changed = true;
                    }
                    if (issafe(i - 1, j) &&
                             v[i - 1][j] == 1)
                    {
                        v[i - 1][j] = v[i][j] + 1;
                        changed = true;
                    }
                    if (issafe(i, j - 1) &&
                             v[i][j - 1] == 1)
                    {
                        v[i][j - 1] = v[i][j] + 1;
                        changed = true;
                    }
                }
            }
        }
  
     
        if (!changed)
            break;
             
        changed = false;
        no++;
    }
  
    for(int i = 0; i < R; i++)
    {
        for(int j = 0; j < C; j++)
        {
             
         
            if (v[i][j] == 1)
                return -1;
        }
    }
  
  
    return no - 2;
}
 
	
	public static void main(String[] args) throws Exception {
		
      
     
      int m, n, i, j;   
    Scanner sc=new Scanner(System.in);   

     m = sc.nextInt();   

       n = sc.nextInt();   

       int array[][] = new int[m][n];   

      for (i = 0; i < m; i++)   
       for (j = 0; j < n; j++)   
         array[i][j] = sc.nextInt();  
        
       System.out.println(rotOranges(array));
	}

}
