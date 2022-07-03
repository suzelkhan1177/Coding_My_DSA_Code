package Binary_Serch_Tree;

class deleteClass
{
	BinaryTreeNode<Integer> root;
	boolean isDelete;
	deleteClass(BinaryTreeNode<Integer> root,boolean isDelete)
	{
		this.root = root;
		this.isDelete = isDelete;
	}
}
public class BST_Class {
	
	private BinaryTreeNode<Integer> root = null;
	private  int size;
	
	
	private BinaryTreeNode insertBST(BinaryTreeNode<Integer> root, int x) {
		
		if(root == null) {
			return new BinaryTreeNode(x);
		}
		
		if(root.data < x) {
			
			root.right = insertBST(root.right , x);
		}
		
		if(root.data > x) {
			
			root.left = insertBST(root.left , x);
		}
		
		return root;
	}
	
private boolean searchInBST(BinaryTreeNode<Integer> root, int x) {
		
		if(root == null) {
			return false;
		}
		
		if(root.data == x) {
			return true;
		}
		
		if(root.data < x) {
		  return searchInBST(root.right , x);
		}
		
		
		return searchInBST(root.left , x);
	}
    
	
    private void printBST(BinaryTreeNode<Integer> root) {
	 
    	   if(root == null)
    		   return;
    	   
    	   System.out.print(root.data+":");
    	   if(root.left != null) {
    		   System.out.print("L:"+ root.left.data + ",");
    	   }else {
    		   System.out.print("L:-1,");
    	   }
    	   
    	   if(root.right != null) {
    		   System.out.print("R:"+ root.right.data );
    	   }else {
    		   System.out.print("R:-1");
    	   }
    	   System.out.println();
    	   
    	   printBST(root.left);
    	   printBST(root.right);
     }
   
    public  deleteClass deleteHelper(BinaryTreeNode<Integer> root2, int x)
	{
		if(root2 == null)
		{
			deleteClass temp = new deleteClass(null,false);
			return temp;
		}
		if(root2.data < x)
		{
			deleteClass left = deleteHelper(root2.right,x);
			root2.right = left.root;
			left.root = root2;
			return left;
		}
		else if(root2.data > x)
		{
			deleteClass right=deleteHelper(root2.right,x);
			root2.right = right.root;
			right.root = root2;
			return right;
		}
		else
		{
			deleteClass temp = null;
			if(root2.left == null && root2.right == null)
			{
				temp = new deleteClass(null,true);
			}
			
			else if(root2.left == null && root2.right!=null)
			{
				temp = new deleteClass(root2.right,true);
			}
			else if(root2.left!=null && root2.right == null)
			{
				temp = new deleteClass(root2.left,true);
			}
			
			else if(root2.left!=null && root2.right!=null)
			{
				root2.data = minValue(root2.right);
				deleteClass temp2 = deleteHelper(root2.right,root2.data);
				root2.right = temp2.root;
				temp = new deleteClass(root2,true);
			}
			return temp;
				
		}
	}
    
 private int minValue(BinaryTreeNode<Integer> root){
     
     int min = root.data;
     while(root.left != null){
         
         min = root.left.data;
         root = root.left;
     }
     return min;
 }
	
	public void insert(int data) {
		
	root =	insertBST(root, data);
		size++;
	}
	
	public void remove(int data) {
		
	     deleteHelper(root, data);
	     size--;
	}
	
	public void printTree() {
		printBST(root);
	}
	
	
	
	public boolean search(int data) {
		
		
   return searchInBST(root, data);
	}
	
	
	
}
