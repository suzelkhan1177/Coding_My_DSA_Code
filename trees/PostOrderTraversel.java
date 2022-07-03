package trees;

public class PostOrderTraversel {

public static void printPostOrder(TreeNode<Integer> root){
		
        for(TreeNode<Integer> child : root.children){
            
            printPostOrder(child);
        }
        System.out.print(root.data + " ");

	}
}
