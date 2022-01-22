package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combination_ForLoop {

	public static void main(String[] args) {
		
		
		
// we habe to  do  the same  questions   with   another  questions    we hab=ve to   do with the loop  
		
		int[]  arr = {2,3,6,7};
		
				
		}
	

	public   static   List<List<Integer>>     subsets(int[] arr,int  target)
	{
		List<List<Integer>> list =new ArrayList<>(); 
		
		  
		   backloop(list,new ArrayList<>(),arr ,0,target);
		
		   
		   
		   return list; 
	
	
	}
	
	
	
	public static  void backloop(List<List<Integer>> list , List<Integer> ds,int[] arr , int i , int target)
	{
		
		
		
		for(int z=0;z<arr.length;z++)
		{
		
			if(arr[z]<=target)
			{
				ds.add(arr[z]);
				backloop(list, ds, arr, i, target-arr[z]);
				ds.remove(ds.size()-1);
			}
		}
	}
	
	
	}
