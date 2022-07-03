package Binary_Serch_Tree;

public class BST_ClassUse {
  
	public static void main(String[] args) {
		
		BST_Class b = new BST_Class();
		
		b.insert(6);
		b.insert(5);
		b.insert(4);
		b.insert(3);
		b.insert(10);
		b.insert(11);
		b.insert(20);
		
		b.printTree();
		
		b.remove(10);
		
		System.out.println("After Delete element");
		b.printTree();
		
//		System.out.println(b.search(20));
		
//		System.out.println(b.size());
//		System.out.println("Code run");
		
	}
	
	  
}
