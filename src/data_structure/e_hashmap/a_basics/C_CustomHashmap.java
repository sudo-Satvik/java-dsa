package data_structure.e_hashmap.a_basics;

import java.util.LinkedList;

public class C_CustomHashmap {
    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOADFACTOR = 0.75f;
        private int entries;      // number of entries
        private LinkedList<Node>[] buckets;     // hash table

        private class Node {
            K key;
            V val;
            Node(K key, V val) {
                this.key = key;
                this.val = val;
            }
        }

        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        public int size(){  // return the number of entries in map
            return entries;
        }

        public void put(K key, V val) {     // must take care for insert and update
            int bucketIndex = hashFunc(key);
            LinkedList<Node> currBucket = buckets[bucketIndex];
            // we need to search for the key ~ if present update, else put
            int entryIndex = searchInBucket(currBucket, key);
            if (entryIndex == -1) { // key doesn't exist then we have to insert new node
                Node newNode = new Node(key, val);
                currBucket.add(newNode);
                //increasing the entry
                entries++;
            } else {    // updating the value
                Node currNode = currBucket.get(entryIndex);
                currNode.val = val;
            }
        }

        public V get(K key) {
            int bucketIndex = hashFunc(key);
            LinkedList<Node> currentBucket = buckets[bucketIndex];
            int entryIndex = searchInBucket(currentBucket, key);
            if (entryIndex != -1) {
                Node currNode = currentBucket.get(entryIndex);
                return currNode.val;
            }
            return null;            // key doesn't exist!
        }

        public V remove(K key) {
            int bucketIndex = hashFunc(key);
            LinkedList<Node> currBucket = buckets[bucketIndex];
            int entryIndex = searchInBucket(currBucket, key);
            if (entryIndex != -1) { // key exist
                Node currNode = currBucket.get(entryIndex);
                V val = currNode.val;
                currBucket.remove(entryIndex);
                entries--;
                return val;
            }
            return null;            // key doesn't exist
        }

        // Helper functions
        private void initBuckets(int N) {   // N = size or capacity of bucket array
            buckets = new LinkedList[N];
            // Initialising empty LinkedList in every bucket
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // Traversing the linkedlist and looks for a node with key
        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0 ; i < ll.size() ; i++) {
                if (ll.get(i).key == key) return i;
            }
            return -1;
        }

        private int hashFunc(K key) {
            // In java, hashCode() is a built-in type that takes a key and convert it into hashed key (integer)
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("Testing put!");
        mp.put("a", 1);
        mp.put("c", 2);
        mp.put("d", 3);
        mp.put("a", 5);     // update
        System.out.println("Testing size: " + mp.size());

        // Testing get
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("d"));


        // Testing remove
        System.out.println("Removed: " + mp.remove("c"));
        System.out.println("Removed: " + mp.remove("c"));
    }
}
