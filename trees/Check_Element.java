package trees;

public class Check_Element {

	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

		if(root.data == x){
            return true;
        }
        
        for(TreeNode<Integer> child : root.children){
            
            boolean fun = checkIfContainsX(child, x);
            if(fun){
                return true;
            }
            
        }
        
        return false;

	}
}
