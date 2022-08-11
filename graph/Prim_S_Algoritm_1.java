package graph;

import java.util.*;
public class Prim_S_Algoritm_1 {
	
	 public static ArrayList<ArrayList<Integer>> calculatePrimsMST(int n, int m, ArrayList<ArrayList<Integer>> g)
     {
         
       // Adjecncy List
          ArrayList<ArrayList<Integer>> adj = new   ArrayList<ArrayList<Integer>>(n);
          
          for(int i=0; i<n; i++) {
              adj.add(new ArrayList<Integer>(n));
              
              for(int j=0; j<n; j++) {
                   adj.get(i).add(0);
              }
          }
          
          
         for(int i=0; i<g.size(); i++) {
              adj.get(g.get(i).get(0)-1).set(g.get(i).get(1) -1 , g.get(i).get(2));
              adj.get(g.get(i).get(1)-1).set(g.get(i).get(0) -1 , g.get(i).get(2));
         }
         
         
         //Initiliz element
         ArrayList<Integer> parent = new ArrayList<Integer>(n);
         ArrayList<Integer> key = new ArrayList<Integer>(n);
         ArrayList<Boolean> mst = new ArrayList<Boolean>(n);
         
         //Initilize defult value 
         for(int i=0; i<n; i++) {
             key.add(Integer.MAX_VALUE);
             mst.add(false);
              parent.add(-1);
         }
         
         key.set(0, 0);
         parent.set(0, -1);
         
        for(int  count =0;  count <n; count++) {
           
           //min key
           int min = Integer.MAX_VALUE;
          int u = -1;
          
          //find min wali Node
          for(int v=0; v < n; v++) {
               if(mst.get(v) == false && key.get(v) < min) {
                  
                   min = key.get(v); 
                   u = v;
                   
              }
          }
           
           //adjencey List
           mst.set(u, true);
           
           for(int v=0; v < n; v++) {
               
               if(adj.get(u).get(v) != 0 &&  mst.get(v) == false && adj.get(u).get(v) < key.get(v) ) 
               {
                   parent.set(v, u);
                   key.set(v, adj.get(u).get(v));
                   
               }
           }
           
       }
         ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
      
         for(int i=1; i<n; i++) {
             
                result.add(new ArrayList<Integer>());
                
                result.get(i-1).add(parent.get(i) + 1);
                result.get(i-1).add(i + 1);
                result.get( i -1).add(key.get(i));
         }
         
         return result;
 }
}
