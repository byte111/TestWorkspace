package com.ds;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
public class CountBirds {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int TEST = Integer.parseInt(br.readLine().trim());
		ArrayList<Integer> results = new ArrayList<Integer>();
		while(TEST > 0)
		{
			int N = Integer.parseInt(br.readLine().trim());

			String[] arr_arr = br.readLine().split(" ");
			int[] arr = new int[N];
			for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
			{
				arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
			}
			
			int Q = Integer.parseInt(br.readLine().trim());
			
			while(Q > 0)
			{
			String[] arr_arr1 = br.readLine().split(" ");
			
			int X = Integer.parseInt(arr_arr1[0]);
			int Y = Integer.parseInt(arr_arr1[1]);
			//System.out.println(find(arr,X,Y));
			results.add(find(arr,X,Y));
			Q--;
			}
			TEST--;
		}
		
		for(Integer i : results)
		{
			System.out.println(i);
		}
	}
	
	static int find(int time[],int X, int Y)
	{
		if( X >= Y) return -1;
		int count=0;
		for(int  i = 0 ; i < time.length; i++)
		{
			if((Y-X) >= time[i]) {
				count++; continue;
			}
			
			if(time[i]>= X && time[i]<=Y) count++;
		}
		return count;
	}
}
