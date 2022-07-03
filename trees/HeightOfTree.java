package trees;

import java.util.*;
public class HeightOfTree {

	//Approch 1
public static int getHeight1(TreeNode<Integer> root){
        
        int ht =0;
         for(TreeNode<Integer> child : root.children){
             
             int ct = getHeight1(child);
             ht = Math.max(ct, ht);
         }
        
        return ht+1;
  }

//Approch 2
public static int getHeight2(TreeNode<Integer> root){
    
    int level = 0;
	    int curlevel = 1;
      int nextlevel = 0;
     
      LinkedList<TreeNode> q = new LinkedList<TreeNode>();
      q.add(root);
     
      while(!q.isEmpty()){
         
          TreeNode<Integer> temp = q.remove();
         
             if(curlevel == 0){
            	 level++;
            	curlevel = nextlevel;
                 nextlevel =0;
             }
         
          for(TreeNode<Integer> n : temp.children){
              q.addLast(n);
              nextlevel++;
          }
          curlevel--;
         }
     
     
      return level+1;
     
  }
}
