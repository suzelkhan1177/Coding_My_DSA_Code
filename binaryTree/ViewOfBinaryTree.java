package binaryTree;

import java.util.*;
public class ViewOfBinaryTree {
	
	 static class Pair{
	        int hd;
	        BinaryTreeNode node;
	        
	        Pair(int hd, BinaryTreeNode node){
	            this.hd = hd;
	            this.node = node;
	        }
	    }
     
	    //Top Veiw in Bainary Tree
	 static ArrayList<Integer> topView(BinaryTreeNode root)
	    {
	         Queue<Pair>  q = new ArrayDeque<>();
	         Map<Integer, Integer> map = new TreeMap<>();
	         
	         q.add(new Pair(0, root));
	         
	         while(!q.isEmpty()){
	             
	                Pair curr = q.poll();
	                
	                if(!map.containsKey(curr.hd)){
	                    
	                    map.put(curr.hd, (int) curr.node.data);
	                }
	                
	                if(curr.node.left != null){
	                    
	                    q.add(new Pair(curr.hd-1, curr.node.left));
	                }
	                
	                if(curr.node.right != null){
	                    
	                    q.add(new Pair(curr.hd+1, curr.node.right));
	                }
	         }
	         
	         ArrayList<Integer> ans = new ArrayList<>();
	         
	         for(Map.Entry<Integer, Integer> entry : map.entrySet() ){
	             
	             ans.add(entry.getValue());
	         }
	         
	         return ans;
	        
	    }
	 
	 
	 
	 // Bottom View of Binary Tree
	  public ArrayList <Integer> bottomView(BinaryTreeNode root)
	    {
	          Queue<Pair>  q = new ArrayDeque<>();
	         Map<Integer, Integer> map = new TreeMap<>();
	         
	         q.add(new Pair(0, root));
	         
	         while(!q.isEmpty()){
	             
	                Pair curr = q.poll();
	            
	                    
	                    map.put(curr.hd, (int)curr.node.data);

	                
	                if(curr.node.left != null){
	                    
	                    q.add(new Pair(curr.hd-1, curr.node.left));
	                }
	                
	                if(curr.node.right != null){
	                    
	                    q.add(new Pair(curr.hd+1, curr.node.right));
	                }
	         }
	         
	         ArrayList<Integer> ans = new ArrayList<>();
	         
	         for(Map.Entry<Integer, Integer> entry : map.entrySet() ){
	             
	             ans.add(entry.getValue());
	         }
	         
	         return ans;
	    }
	  
	  
	  //Left Veiw of BinaryTree
	  
	  private int maxLevel =-1;
	   private ArrayList<Integer> list = new ArrayList<>();
	   public  void printLeftView(BinaryTreeNode root, int level){
	        
	        if(root == null){
	            return;
	        }
	        
	       if(maxLevel < level){
	           list.add((int) root.data);
	           maxLevel = level;
	       }
	        
	        printLeftView(root.left,level +1);
	        printLeftView(root.right, level +1);
	    }
	    
	    
	   public ArrayList<Integer> leftView(BinaryTreeNode root)
	    {
	    
	       printLeftView(root , 0);
	       return list;
	    }
	   
	   //Right veiw Of Binary Tree
	   
	   public void printRightView(BinaryTreeNode root, int level){
	        
	        if(root == null){
	            return;
	        }
	        
	       if(maxLevel < level){
	           list.add((int)root.data);
	           maxLevel = level;
	       }
	        printRightView(root.right, level +1);
	        printRightView(root.left,level +1);
	        
	    }
	    
	    ArrayList<Integer> rightView(BinaryTreeNode root) {
	    
	        printRightView(root , 0);
	       return list;
	    }
	
	   
}
