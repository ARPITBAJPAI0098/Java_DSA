import java.util.LinkedList;

public class ownhashapimplement {
    public static class myhashmap<k, v> {
        public static int default_capacity = 4;
        public static final float default_load_factor = 0.75f;// in order to secure the are using final

        public class node {

            k key;
            v value;

            node(k key, v value) {
                this.key = key;
                this.value = value;

            }
        }

        private int n;
        private LinkedList<node>[] buckets;

        private void initbuckets(int n) {// n is the size of bucket array
            buckets = new LinkedList[n];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFun(k key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % (buckets.length);
        }

        public int size() {
            return n;

        }

        public void put(k key, v value) {

        }

        public v get(k key) {// here in return we want value that why we have written
            // v

        }

        public k remove(k key) {

        }

        public static void main(String[] args) {
            myhashmap<String, Integer> mp = new myhashmap<>();
            myhashmap<String, String> mp1 = new myhashmap<>();

        }
    }
}
/*
 * import java.util.*;
 * public class Test{
 * static class myhashmap<K, V>{
 * public static final int default_capacity = 4;
 * public static final float default_loadfactor = 0.75f;
 * private class Node {
 * K key;
 * V value;
 * 
 * Node(K key, V value) {
 * this.key = key;
 * this.value = value;
 * }
 * }
 * private int n;
 * private LinkedList<Node>[] buckets;
 * private void initbuckets(int n){
 * buckets = new LinkedList[n];
 * for(int i = 0; i < buckets.length; i++){
 * buckets[i] = new LinkedList<>();
 * }
 * }
 * private int hashfunc(K key){
 * int hc = key.hashCode();
 * return (Math.abs(hc)) % buckets.length;
 * }
 * private int searchinbucket(LinkedList<Node> currbucket, K key){
 * for(int i = 0; i < currbucket.size(); i++){
 * if(currbucket.get(i).key == key){
 * return i;
 * }
 * }
 * return -1;
 * }
 * public myhashmap(){
 * initbuckets(default_capacity);
 * }
 * public int size(){
 * return n;
 * }
 * public void put(K key, V value){
 * int bi = hashfunc(key);
 * LinkedList<Node> currbucket = buckets[bi];
 * int ei = searchinbucket(currbucket, key);
 * if(ei == -1){
 * Node node = new Node(key, value);
 * currbucket.add(node);
 * n++;
 * }else{
 * Node currnode = currbucket.get(ei);
 * currnode.value = value;
 * }
 * }
 * public V get(K key){
 * int bi = hashfunc(key);
 * LinkedList<Node> currbucket = buckets[bi];
 * int ei = searchinbucket(currbucket, key);
 * if(ei != -1){
 * Node currnode = currbucket.get(ei);
 * return currnode.value;
 * }
 * return null;
 * }
 * public V remove(K key){
 * int bi = hashfunc(key);
 * LinkedList<Node> currbucket = buckets[bi];
 * int ei = searchinbucket(currbucket, key);
 * if(ei != -1){
 * Node currnode = currbucket.get(ei);
 * V val = currnode.value;
 * currbucket.remove(ei);
 * n--;
 * return val;
 * }
 * return null;
 * }
 * 
 * 
 * }
 * public static void main(String[] args){
 * myhashmap<String, Integer> map = new myhashmap<>();
 * System.out.println("Testing put");
 * map.put("a", 1);
 * map.put("b", 2);
 * map.put("c", 3);
 * System.out.println("Testing size " + map.size());
 * map.put("c", 30);
 * System.out.println("Testing values " + map.get("a"));
 * System.out.println("Testing values " + map.get("b"));
 * System.out.println("Testing values " + map.get("c"));
 * System.out.println("Testing values " + map.get("d"));
 * System.out.println("Testing remove " + map.remove("c"));
 * System.out.println("Testing remove " + map.remove("c"));
 * System.out.println("Testing size " + map.size());
 * }
 * }
 */
