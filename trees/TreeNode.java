package trees;

import java.util.*;
public class TreeNode<T>{
	
	T data;
	ArrayList<TreeNode<T>> children;
	
	public TreeNode(T data) {
		
		this.data = data;
		this.children = new ArrayList<>();
	}

}
