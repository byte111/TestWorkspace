package com.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;


public class HighestRatings {
	  public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	         int M = Integer.parseInt(br.readLine().trim());
	         int Q = Integer.parseInt(br.readLine().trim());
	         int N = Integer.parseInt(br.readLine().trim());
	         String[] arr_arr = br.readLine().split(" ");
	         int[] arr = new int[N];
	         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
	         {
	         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
	         }

	         int out_ = findHighestRating(Q, arr, M);
	         System.out.println(out_);

	         wr.close();
	         br.close();
	    }
	    static int findHighestRating(int Q, int[] arr, int M){
	        // Write your code here
	    
	    	
	    	
	    	int add[][] = new int[arr.length][Q];
	    	int sub[][] = new int[arr.length][Q];
	    	
	    	for(int i = 0 ; i < arr.length; i++)
	    	{
	    		for(int j = 1; j <= Q; j++)
	    		{
	    			add[i][j-1] = arr[i] + ( M* j);
	    		}
	    	}
	    	
	    	for(int i = 0 ; i < arr.length; i++)
	    	{
	    		for(int j = 1; j <= Q; j++)
	    		{
	    			sub[i][j-1] = arr[i] - ( M* j);
	    		}
	    	}
	    	
	    	HashMap<Integer,Integer> ferquency = new HashMap<Integer,Integer>();
	    	for(int i = 0 ; i < arr.length; i++)
	    	{
	    		for(int j = 0; j < Q; j++)
	    		{
	    			if(ferquency.get(add[i][j]) != null)
	    			{
	    				ferquency.put(add[i][j],ferquency.get(add[i][j])+1);
	    				continue;
	    			}
	    			ferquency.put(add[i][j],1);
	    		}
	    	}
	    	
	    	for(int i = 0 ; i < arr.length; i++)
	    	{
	    		for(int j = 0; j < Q; j++)
	    		{
	    			if(ferquency.get(sub[i][j]) != null)
	    			{
	    				ferquency.put(sub[i][j],ferquency.get(sub[i][j])+1);
	    				continue;
	    			}
	    			ferquency.put(sub[i][j],1);
	    		}
	    	}
	    	int max = 0;
	    	for(Integer k: ferquency.keySet())
	    	{
	    		if(ferquency.get(k) > max)
	    			max = ferquency.get(k);
	    	}
	    	
	    	if(max > 0) return max+1;
	    	return max;
	    }
}
