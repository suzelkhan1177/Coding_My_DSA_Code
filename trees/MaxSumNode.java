package trees;

public class MaxSumNode {

public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		
        TreeNode<Integer> ans = root;
        
        int sum = root.data;
        
        for(int i=0; i<root.children.size(); i++){  // sum of root data
            sum += root.children.get(i).data;
        }
        
        for(int i=0; i<root.children.size(); i++){
            
            TreeNode<Integer> childMax = maxSumNode(root.children.get(i)); // Recursion
            
            int smallSum = childMax.data;
            
            for(int j =0; j<childMax.children.size(); j++){
                
                smallSum += childMax.children.get(j).data;
            }
            
            if(sum <= smallSum){
                
                ans = childMax;
                sum = smallSum;
            }  
            
        }
        
        
        return ans;
	}
}
