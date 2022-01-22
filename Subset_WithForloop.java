package Backtracking;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.JoinRowSet;
import javax.swing.ListModel;
import javax.swing.Renderer;

public class Subset_WithForloop {
//  #   this is the same  question  with  the above  but ib this   instead of   iniviadual    calling twon timee    we  will call    to time 
	//   lets see how 
	///  in  thhis   we   want    retuen in    the   format of  the     lsit  inside the lsit 
	
	public static void main(String[] args) {
	  int[]  arr = {1,2,3};
	  
	  
	  
	  
	  
	  
	  
	  
	}
public   static  List<List<Integer>>    subset(int []  arr)
{
	List<List<Integer>> list=new ArrayList<>();
	
	
	backloop(list,new ArrayList<>(),arr,0);
	
	
	
	
	
	
   return list;
	
	
	
	
}
	
	

	public static  void  backloop(List<List<Integer>> list ,List<Integer> ds, int[]  arr , int i )
	{
       //   this  will  follow  the  approaach  of the  loop      function and thats  how   this  will  work
		
		//   how  this is  working as  the   loop is  begining then call happening 
		//   then  call   again   redirect with the loop  nut with another number  //  then  again   call  again  loop 
		//   ye   sb  har ek  i=0,1,2 index ke liye hoga and  then  the answers  will  be printred 
		
		//   link  to imag  
		
		
		
		
		// https://leetcode.com/problems/subsets/discuss/27281/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)/728683
		list.add(new ArrayList<>(ds));
		for(int  z=i;z<arr.length;z++)
			
		{
			ds.add(arr[z]);
			backloop(list, ds, arr, z+1);
			ds.remove(ds.size()-1);
		}
		
		
		
	}
	
}
