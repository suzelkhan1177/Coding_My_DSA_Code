package trees;

public class Number_of_nodes_greater_than_x {
  
	
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		int count =0;
		if(root == null)
			return -1;
		
		 if(root.data  > x){
             count++;
         }
		 for(int i=0; i<root.children.size(); i++){
             
             TreeNode<Integer> child = root.children.get(i);
             numNodeGreater(child, x);
             
         }
        
        return count;
	}
	
	
}
