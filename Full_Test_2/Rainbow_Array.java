package Full_Test_2;


import java.util.*;

//Sample Input 1:
//19
//1 2 3 4 4 5 6 6 6 7 6 6 6 5 4 4 3 2 1
//Sample output 1:
//Yes

public class Rainbow_Array {
	 public static void israinbow(int [] s){
         int i,j,n=s.length;
       if(s[0]!=1)
        System.out.println("no");

       for(i=0,j=n-1;i<j;i++,j--)
          if((s[i]!=s[j]) || (s[i+1]-s[i]>1 )|| ( s[i+1]-s[i]<0 ) || (s[i]<1 )|| (s[i] > 7))
               break;

          if(i<j || s[i]!=7)
             System.out.println("no");
        else
            System.out.println("yes");

    }
  
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner (System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	
	israinbow(a);
	
	}
  
}
