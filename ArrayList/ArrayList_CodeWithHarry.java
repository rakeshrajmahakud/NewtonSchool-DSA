package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_CodeWithHarry {
    public static void main(String[] args) {
        ArrayList<Integer> myarr= new ArrayList<>(6);
        ArrayList<Integer> myarr1= new ArrayList<>(6);
        myarr.add(5);
        myarr.add(7);
        myarr.add(8); // add method
        System.out.println(myarr);
        System.out.println(myarr.get(1));// get the index value  // get method
        System.out.println(myarr.size());// size method tell the array list length
        myarr.add(1,17);// add value by telling index //
        System.out.println(myarr);

        myarr1.add(400);
        myarr1.add(200);
        myarr1.add(50);
        myarr1.add(700);
        myarr.addAll(myarr1);// directly add allelements of myarr1 to myarr also if we want then we can give ondex position for adding
        myarr1.remove(1); // we remove 1 index value of myarr1
        System.out.println(myarr1.isEmpty()); // this method check the array is empty or not
        Collections.sort(myarr1); // collection.sort method sort the arrylist myarr
        System.out.println(myarr1); // after the array is sorted


    }
}
