package trees;

public class CheackIdentiacal {

	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

        if(root1.data != root2.data){
            return false;
        }
        
        if(root1.children.size() != root2.children.size()){
              return false;
         }
        
        boolean ans = true;
         for(int i=0; i<root1.children.size(); i++){
            
            boolean sml =     checkIdentical(root1.children.get(i) , root2.children.get(i));
            if(sml == false){
                ans = sml;
                return ans;
            }
        }
        
        return ans;
        
	}
}
