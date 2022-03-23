package Hashing;

import java.util.HashSet;

public class Hashset_codeWithHarry {
    public static void main(String[] args) {
        HashSet<Integer> myhash = new HashSet<>(3,0.5f);
        myhash.add(5); //add method
        myhash.add(6);
        myhash.add(7);
        myhash.add(8);
        myhash.add(9);
        System.out.println(myhash);
        System.out.println(myhash.size());  //size method to tell the size of the arraylist
        System.out.println(myhash.isEmpty());//it tells array is empty or not(return boolean value)
        System.out.println(myhash.hashCode());// return hash code
    }
}
