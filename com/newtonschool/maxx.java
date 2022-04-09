package com.newtonschool;

import java.util.*;
public class maxx {
    public static void main (String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase>0)
		{
			int len = sc.nextInt();
			long a[] = new long[len];

			for(int i=0;i<len;i++)
				a[i] = sc.nextLong();
			Arrays.sort(a);

			System.out.println(a[len-1]+" "+a[len-2]+" "+a[len-3]);
			testcase--;
		}
	} 
}
