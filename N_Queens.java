package Bactracking_Pep;

import java.nio.channels.NonWritableChannelException;
import java.security.PublicKey;
import java.util.Scanner;

import javax.sound.midi.VoiceStatus;
import javax.swing.LayoutStyle.ComponentPlacement;

public class N_Queens {

	public static void main(String[] args) {
		
		
		
   //   we have  to place  the queens such that no queen can kill  each other 
    /// we have  to place such that
		
		// we   will be   given  some   2d array and then we have 
		//   we have to place some  queens anf thrn  we  will play in the fashion of some random
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		 //nt m=scn.nextInt();
		int[][] arr =new int[n][n];
		  
		placeQueens(arr,"",0 );
	
	}
//  the  things  which  play in  option always come in the place of  the loo[
	
	
	
	
public   static   void placeQueens(int [][] arr,String qsf, int row )
{
	
	//   this is   the only  version  that   queens is how placed 
	
	for(int col =0;col<arr.length;col++)
	{
		if(isQueenSafe(arr,row,col)==true)
		{
		//   every   no in the loop and is   the  one   iteratino  and  har ke liye  kuch kuch hoga
		if(row==arr.length)
		{
			System.out.println(qsf);
			return;
		}
		arr[row][col]=1;
		placeQueens(arr, qsf+row+"--"+col, row+1);
	//   waspis   when yu are returning  then  always  demean   your place 
		arr[row][col]=0;
		
		
	}
	}

}
	
	public static  boolean isQueenSafe(int[][] arr , int row , int  col)
	{
		// is  queen  safe  we have   to  check      three wasys   then that is  that    vertically  and  diagonally both sides 4
		
		
		//  upar then 
	  for( int i=row-1,j=col;i>=0 ; i--)
	  {
		  if(arr[i][j]==1)
		  {
			return  false;  
		  }
	  }
		
		//    diagonally 
	  for(int i=row-1, j=col-1 ; i>=0 && j>=0;i--,j--)
	  {
		  
		  if(arr[i][j]==1)
		  {
			return  false;  
		  }
	  }
	  
	  
	  for(int i=row-1,j=col+1;i>=0&&j<arr.length;i--,j++)
	  {
		  
		  if(arr[i][j]==1)
		  {
			return  false;  
		  }
	  }
		
		
		
		
		
		return  true;
		
		
		
		
		
	}
	
}
