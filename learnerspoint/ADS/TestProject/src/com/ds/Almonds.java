package com.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Almonds {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	        int T = Integer.parseInt(br.readLine().trim());
	        for(int t_i=0; t_i<T; t_i++)
	        {
	            int A = Integer.parseInt(br.readLine().trim());
	            int B = Integer.parseInt(br.readLine().trim());
	            int K = Integer.parseInt(br.readLine().trim());

	            int out_ = solve(A, K, B);
	            System.out.println(out_);
	            System.out.println("");
	         }

	         wr.close();
	         br.close();
	    }
	    static int solve(int A, int K, int B){
	        // Write your code here
	    	if( A <= B) return -1;
	    	int count = 0;
	    	while(K > 0)
	    	{
	    		K = K-A;
	    		K = K+B ; 
	    		count++;
	    	}
	    	return count-1;
	    
	    }
}
