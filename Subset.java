package Backtracking;

import java.awt.desktop.AboutHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

public class Subset {

	public static void main(String[] args) 
	
	{
	//  in this   thery  we will    use the  concept of inclusion and  exclusion an
	//   here  we  will  go these to  the  account  and   the   kano pe   meer krna  ha mudery 
		
	//  given an  array  of the numbers  and  alll  the number  are unique and  they are no repeted and then we will  apply backtarclong 
//   jisme  ham  log kuch elements   ko leta aoor kuch ko nahi leta ha
		
		
		
	//  we  need  to   return array inside  the array  so we  will call  List<List> Method 
		
		
		  int[] arr = {1,2,3};
		  
		 List<List<Integer>>  addList = subset(arr);
		 System.out.println(addList);
		

	}
	
	public    static   List<List<Integer>> subset(int[] arr)
	{
		
		
		List<List<Integer>> list =new ArrayList<>();
	     backtracking(list,new ArrayList<>(),arr,0);
		
		
		return list;
	}
	//   this ds is   to  store  the values in  the  data  structuer of the array 
	public  static void backtracking(List<List<Integer>>  list ,List<Integer> ds ,int[] arr , int i)
	
	{
		//   pehele   hamesha  left call   lagati ha  wha tk  wo  deep  me jatta ja and then wo  return  hota ha phir  apne base case   se wapis  se right
		//   call ki  tarak  challa  jattt ha 
		if(i==arr.length)
		{
			list.add(new ArrayList<>(ds));
			return;
		}
		
		//  when  ever there is any     recursion  call is  there      
	  ///  1,2,3 
		//1   is  the  left  call  for the recursion and then   we remember the lessson  that we need  to  first     execuete left call
		//   and  then reach thhe base  case   
		//  then  there will be  the     some  consitions  i n  the base and then  
		//   in  condition  of the     recursion  and  then 
		//     then   we will  again  at the   begininng   of the loop  and then  again  rc will  be  execute   and   ///   all  the   things that  
		//  camee along  the  way and  then   agaiin  this  all  shit will  bee repeated 
		
		ds.add(arr[i]);
		backtracking(list, ds, arr, i+1);
		ds.remove(ds.size()-1);
		
	  
		backtracking(list, ds, arr, i+1);
		
		
		
	}
	
	
	
	
	

}
