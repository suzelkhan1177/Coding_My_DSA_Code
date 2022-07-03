package Binary_Serch_Tree;

import java.util.*;
public class Assinment_Que2 {
	
	      public static boolean findpairUtil(BinaryTreeNode<Integer> root, int sum,
                 HashSet<Integer> set)
       {
             if (root == null)
               return false;

         if (findpairUtil(root.left, sum, set))
                  return true;

         if (set.contains(sum - root.data)) {
         System.out.println((sum - root.data) + " " +root.data);

        }
        else
           set.add(root.data);

            return findpairUtil(root.right, sum, set);
        }
	 
	 
         public static void printNodesSumToS(BinaryTreeNode<Integer> root, int sum) {

            HashSet<Integer> set = new HashSet<Integer>();
            findpairUtil(root, sum, set);

        }

}
