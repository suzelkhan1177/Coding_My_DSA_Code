package graph;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


// Comparator for sorting edges in increasing order of their weights
class ListComparator<T extends Comparable<T>> implements Comparator<ArrayList<T>> {

 @Override
 public int compare(ArrayList<T> firstEdge, ArrayList<T> secondEdge) {
  
  T firstWeight = firstEdge.get(2);
  T secondWeight = secondEdge.get(2);
  
  return Integer.valueOf(firstWeight.toString()) - Integer.valueOf(secondWeight.toString());
 }
    
}

public class KruskalAlgorithm_1 {

     private static int findSet(ArrayList<Integer> parent, int node) {
      if (node == parent.get(node)) {
       return node;
      }
       parent.set(node, findSet(parent, parent.get(node)));
        return parent.get(node);
     }
    
     private static void makeSet(ArrayList<Integer> parent, ArrayList<Integer> rank, int node) {
      parent.set(node, node);
      rank.set(node, 0);
     }
    
     private static void unionSet(ArrayList<Integer> parent, ArrayList<Integer> rank, int u, int v) {
      u = findSet(parent, u);
      v = findSet(parent, v);

       if (rank.get(u) < rank.get(v)) {
          parent.set(u, v);    
       }else if(rank.get(v) < rank.get(u)) {
           
           parent.set(v,u);
       }else {
           parent.set(v, u);
           rank.set(u, rank.get(u) + 1);
       }
     }

  
     public static int minimumSpanningTree(ArrayList<ArrayList<Integer>> edges, int n) {
         
     Collections.sort(edges, new ListComparator<>());
         
      int minWeight = 0;
      ArrayList<Integer> parent = new ArrayList<>();
      ArrayList<Integer> rank = new ArrayList<>();

      for (int i = 0; i < n; i++) {
       parent.add(null);
       rank.add(null);
      }

     
      for (int i = 0; i < n; i++) {
       makeSet(parent, rank, i);
      }

     
      for (int i = 0; i < edges.size(); i++) {
      
       int u = findSet(parent, edges.get(i).get(0));
       int v = findSet(parent, edges.get(i).get(1));
          
       if (u != v) {
        minWeight += edges.get(i).get(2);
        unionSet(parent, rank, u, v);
       }
      }

      return minWeight;
     }
}