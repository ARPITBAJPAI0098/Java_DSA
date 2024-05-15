package hashmaps;

import java.util.*;
import java.util.Scanner;

public class hashmap {
    // what is hashmap

    // a type of data structure which is used to store data in the form of key and
    // value pair
    // data can be stored randomly no matter about the sequence in hasmaps
    // ued for mapping
    // eg every student map with their respective roll no
    /*
     * time complexity of
     * 1>searching
     * 2>insertion
     * 3>deletion
     * 4>contains
     * alll are done dne in O(1)
     */

    static void hashmapmethod() {
        // syntax
        HashMap<String, Integer> hp = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        // adding element
        hp.put("akash", 21);// same put functionon ssaem key will update the value of the particular key
                            // value pair if it is laready pesent
        hp.put("akash", 23);// if not present earliere thenput function will cause insertion
        hp.put("akash", 25);
        hp.put("akash", 27);
        // getting value of a key from the hashmap
        System.out.println(hp.get("yash"));// get work on key
        // changing/updating value of a key
        /*
         * hp.put("akash", 40);// now value get uodated
         * for (int i = 0; i < 6; i++) {
         * System.out.println("enter key value pair");
         * String ch = sc.nextLine();
         * int age = sc.nextInt();
         * hp.put(ch, age);
         */

        // remove
        hp.remove("akash");// print25
        hp.remove("riya");// null

        // checking if the key exist in the map or not
        System.out.println(hp.containsKey("akash"));
        // adding a new entry only if the new key doesnot exist
        if (hp.containsKey("akash") == false) {
            hp.put("akash", 50);
        }
        // getting all key in the hashmap
        System.out.println(hp.keySet());// Returns a Set view of the keys contained in this map.
        // get all entries in the hashmap
        System.out.println(hp.entrySet());

        // getting all vALUES in the hashmap
        System.out.println(hp.values());// Returns a Collection view of the values contained in this
        // traversing all entries of hashmap
        // for each loops
        for (String key : hp.keySet())// kaha se kaha tak jana hai key se sari key
        // line wise in array we use for(el:arr)
        {
            System.out.printf("age of %s is %d", key, hp.get(key));// here we used printf beacuse here is use of combine
                                                                   // string nand intger in output
        }
        /*
         * One important feature of the HashMap class is its ability to efficiently
         * store and retrieve key-value pairs. Here are some key features of the HashMap
         * class:
         * 
         * 1. Key-Value Mapping: HashMap allows you to associate a value with a
         * corresponding key. Each key-value pair is stored as an entry in the HashMap.
         * 
         * 2. Fast Retrieval: HashMap provides constant-time performance for basic
         * operations like get() and put(). This means that regardless of the size of
         * the map, the time taken to retrieve or insert a value remains constant on
         * average.
         * 
         * 3. Efficient Storage: HashMap internally uses an array of buckets to store
         * key-value pairs. The hashing algorithm determines the index of the bucket
         * where an entry is stored. This allows for efficient storage and retrieval of
         * values, as the map can quickly locate the bucket using the key's hash code.
         * 
         * 4. Duplicate Keys: HashMap does not allow duplicate keys. If you try to
         * insert a key-value pair with a key that already exists in the map, the
         * existing value associated with that key will be overwritten.
         * 
         * 5. Null Keys and Values: HashMap allows null keys and null values. You can
         * insert a null key or a null value as a valid entry in the map.
         * 
         * 6. Iteration: You can iterate over the entries in a HashMap using various
         * methods like key
         */

    }

    public static void main(String[] args) {
        hashmapmethod();
    }

}
