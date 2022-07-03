package trees;

import java.util.*;
public class PrintOrderTravel {

	public static void printLevelWise(TreeNode<Integer> root){
		
		 int curlevel = 1;
        int nextlevel = 0;
       
       LinkedList<TreeNode> q = new LinkedList<TreeNode>();
       q.add(root);
       
       while(!q.isEmpty()){
           
           TreeNode<Integer> temp = q.remove();
           
              if(curlevel == 0){
                 System.out.println();
                 curlevel = nextlevel;
                  nextlevel =0;
              }
           
           for(TreeNode<Integer> n : temp.children){
               q.addLast(n);
               nextlevel++;
           }
           curlevel--;
            
           System.out.print(temp.data + " ");
    
       }

	}
}
