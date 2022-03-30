//https://www.geeksforgeeks.org/print-distinct-elements-given-integer-array/
//Print All Distinct Elements of a given integer array
//Difficulty Level : Easy
//Last Updated : 11 Feb, 2022
//Given an integer array, print all distinct elements in array. The given array may contain duplicates and the output should print every element only once. The given array is not sorted.
//Examples:
//
//Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
//Output: 12, 10, 9, 45, 2
//
//Input: arr[] = {1, 2, 3, 4, 5}
//Output: 1, 2, 3, 4, 5
//
//Input: arr[] = {1, 1, 1, 1, 1}
//Output: 1
//------------------------------------------------

package Hashing;
import java.util.HashSet;

public class AllDistintictElementOnGivenArray {
    public static void main(String[] args) {
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])){
                set.add(arr[i]);
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
