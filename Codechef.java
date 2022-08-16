/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc= new Scanner( System.in );
	    int t= sc.nextInt();
	    for ( int j=0;  j < t ; j++ ){
	        int n = sc.nextInt();
	        ArrayList<Integer> array= new ArrayList<>();
	        HashMap <Integer,Integer> map = new HashMap<>();
	         int []a= new int[n];
	        for(int i =0;i<n;i++){
	            a[i]=sc.nextInt();
	            if(! map.containsKey(a[i])){
	                map.put(a[i],1);
	            }else{
	              int x = map.get(a[i]);
	                map.put(a[i],x+1);
	            }
	           
	           // System.out.println(maxValueInMap+"\n");
	           //int value= map.get(maxValueInMap) ;
	           //if(value  == 1){
	           //    System.out.println("NO");
	           //}
	           //else{
	           //    System.out.println("YES");
	           //}
	        }
	         int maxValueInMap = (Collections.max(map.values()));
	         int count = 0;
		    for(int i = 0;i<n;i++){
		        if(map.get(a[i])==maxValueInMap){
		            if(!array.contains(a[i])){
		                array.add(a[i]);
		            }
		        }
		    }
		    if(array.size()==1){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
	        
	        
	    }
		// your code goes here
	}
}
