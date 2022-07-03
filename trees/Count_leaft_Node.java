package trees;

public class Count_leaft_Node {

	public static int countLeafNodes(TreeNode<Integer> root){

		int leaf =0;
		if(root == null)
			return 0;
		
		 if(root.children.size() == 0){
            
             return 1;
         }
		 for(int i=0; i<root.children.size(); i++){
             
            leaf += countLeafNodes(root.children.get(i));
             
         }
        
        return leaf;
	}
}
