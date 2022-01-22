package Backtracking;

import java.lang.annotation.Target;
import java.lang.invoke.CallSite;
import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.JoinRowSet;

public class Combination_Sum {

	public static void main(String[] args) {
	
		
		
		
		
		
		
	//   in  this    we will  have    diff  sets of   the number  and we have to  drive the result and then   we have  to make  the   target  reached 
    //   lets    give an   example 
 
		
		  int[] arr = {2,3,6,7};
		  //   we have to make  the  target to 7
		  // here  we are given the condition that we can  resue the same  element   any number of times  that we   want 
		  
	  //  #    so  basic  idea  here   is    that we   can    use the pic non pic  approach  and  then   we can   stop if  the  target is  reached 
		      
		  int  target =7;
		  
		  
	}

	
	
	public   static   List<List<Integer>>     subsets(int[] arr,int  target)
	{
		List<List<Integer>> list =new ArrayList<>(); 
		
		  
		   backloop(list,new ArrayList<>(),arr ,0,target);
		
		   
		   
		   return list; 
	
	
	}
	
	
 public  static void backloop(List<List<Integer>> list,List<Integer> ds,int[] arr,int i, int target)
 {
	 //   here  the  apppraoch is  that we  can use the  same  element    many  times in  the   combination
	 
	 //  ham    ek   pr   tike   rhe  sakte ha  ya   toh wo  zero  ho jaaega ya    toh   kuch  time  bad wo in  absoute  hi jaaega
	 
	 if(i==arr.length)
		 
	 {
		 if(target==0)
		 {
			 list.add(new ArrayList<>(ds));
		 }
		 return;
	 }

	 
	 
	 if(arr[i]<=target)
	 {
		 
		 ds.add(arr[i]);
		 backloop(list, ds, arr, i, target-arr[i]);
		 ds.remove(ds.size()-1);
	 }
	 backloop(list, ds, arr, i+1, target);
 }
	
	
	
	
	
	
	
	
	
	
	
	
}
