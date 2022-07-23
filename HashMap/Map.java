package HashMap;

import java.util.*;
public class Map<K,V> {
	
	ArrayList<MapNode<K, V>> buckets;
	int count;
	int numBucket;
	
   public Map() {
	   
	   buckets =  new ArrayList<>();
	   numBucket = 20;
	   
	   for(int i=0; i<numBucket; i++) {
		   buckets.add(null);
	   }
   }
   
   public int getBucket(K key) {
	   int hc = key.hashCode();
	   int index = hc% numBucket;
	   return index;
   }
   
   // size
   public int size() {
	   return count;
   }
   
   //getValue
   public V getValue(K key) {
	   int bucketIndex = getBucket(key);
	   MapNode<K, V> head = buckets.get(bucketIndex);
	   
	   while( head != null) {
		   if(head.key.equals(key)) {
			   return head.value;
		   }
	   }
	   return null;
   }
   
   //remove element
   public V removeKey(K key) {
	   int bucketIndex = getBucket(key);
	   MapNode<K, V> head = buckets.get(bucketIndex);
	   MapNode<K,V> prev = null;
	   while( head != null) {
		   if(head.key.equals(key)) {
			  
			   if(prev != null) {
				   prev.next = head.next;
			   }else {
				   buckets.set(bucketIndex, head.next);
			   }
		   }
		   prev = head;
		   head = head.next;
	   }
	   return null;
   }
   
   //insert Function
   public void insert(K key, V value) {
	   int bucketIndex = getBucket(key);
	  MapNode<K,V> head = buckets.get(bucketIndex);
	   
	   //element is already present just value tha value;
	   while(head != null) {
		   
		   if(head.key.equals(key)) {
			   head.value = value;
			   return;
		   }
		   head = head.next;
	   }
	   
	   //element is Not there insert at 0th position
	   head = buckets.get(bucketIndex);
	    MapNode<K,V> newNode = new MapNode<>(key, value);
	    newNode.next = head;
	   buckets.set(bucketIndex, newNode);
	   count++;
   }
 
}
