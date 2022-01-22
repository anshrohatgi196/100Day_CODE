package Bactracking_Pep;

import java.net.Socket;

public class TargetSumSubset {

	public static void main(String[] args) {
		//  here also we  are using  levels and sum appraoch 
		//   so   what we have  to   do is   that given an  array uske  subsets ka sum   hamree print krna ha 
		
		int[] arr = {10,20,30,40,50};
		int  target =60;	
		sumsubset(arr,0,"",0,target);
		}
public   static  void sumsubset(int[] arr , int idx ,String set,  int sos,int target)

{
	if(idx==arr.length)
		
	{
		if(sos==target)
		{
			System.out.println(set+".");
		}
		return;
	}	
//   so element  at each stage has  two   choices
//  one is that   come in the set 
// anotheer is  do not  come in  the set 
//  when  the element will come in  the set  
//  the next level  will  be called  and the  set me addd hoke  wo apna sun  ko  badadega 

	//  when  the number comes  in  the  set 
	sumsubset(arr, idx+1, set+arr[idx]+",",sos+arr[idx], target);
	//   when  the   number does not comes in  the set
	sumsubset(arr, idx+1, set, sos, target);
	
	
	//    idx  will       start   from  0  1  2    and  when  the   index  will   be  at thr  arra .lenght 

	
	
}
	}


