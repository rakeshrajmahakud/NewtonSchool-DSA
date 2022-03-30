package Hashing;

import java.util.HashMap;

public class AllAboutHashing {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("raj",20);
        map.put("rajkumar",70);
        map.put("abdul",120);
        System.out.println(map); //raj 20
        System.out.println(map.put("laxman",30)); //null
        System.out.println(map); // raj 20 , laxman 30      //value updated
        System.out.println(map.put("laxman",40)); // 30 shows previos value at the time of updating value
        System.out.println(map); // raj 20 ,laxman 40 //
        System.out.println(map.get("laxman"));  //getting the value by using key name
        System.out.println(map.keySet()); // returns all keys
        System.out.println(map.containsKey("laxman"));  // returns true if that specific key would be found
        System.out.println(map.size()); // returns the size
        System.out.println(map.isEmpty()); // checks the map is empty of not  returns boolian value
        System.out.println(map.entrySet()); //google it
        System.out.println(map.containsValue(40));
        System.out.println(map.values());  // returns all the values
        System.out.println(map.remove("abdul"));
        System.out.println(map);

    }
}
