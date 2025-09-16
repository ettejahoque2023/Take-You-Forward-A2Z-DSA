import java.util.*;
public class HassingTheory {
    public static void main(String[] args) {

        System.out.println("*********HASHMAP*********");
        //Creating HashMap
        HashMap<Integer,Integer> map = new HashMap<>();

        //Add element to a map - PUT
        map.put(1,2);
        map.put(2,4);
        map.put(9,6);
        
        //Print entire map
        System.out.println(map);

        //Print or get a value for a specific key
        System.out.println(map.get(2));
        //If the key is not in the map---
        System.out.println(map.get(3));//print null

        //Iterate over a map
        // Set<Integer> it =map.keySet();
        for (Integer i : map.keySet()){
            System.out.println(map.get(i));
        }
        // Method - ContainsKey()
        System.out.println(map.containsKey(2));// if contains the key return true 
          System.out.println(map.containsKey(5));//if  not contains key return false

        //Method -remove():remove a key from a map
        map.remove(2);
        System.out.println(map);
        System.out.println(map.containsKey(2));


        System.out.println("**********HASHSET*********");
        //creating hasset
        HashSet<Integer> set = new HashSet<>();
        
        //Add ele to the set: add()
        set.add(1);
        set.add(3);
        set.add(3);
        set.add(6);
        set.add(4);
        set.add(8);
        
        //Print set
         System.out.println(set);

         //Iterate over set
         for(Integer it : set){
            System.out.println(it);
         }
         //Contains key or not
         System.out.println(set.contains(1));
         System.out.println(set.contains(2));


         //set.remove ()
         set.remove(3);
         System.out.println(set);
         
    }
}
