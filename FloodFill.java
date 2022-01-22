package Bactracking_Pep;

import java.util.Iterator;
import java.util.Scanner;import javax.swing.RowFilter;
public class FloodFill {

	public static void main(String[] args) {

		
		
		//  we  have   to  take  input  a  2d arrray 
		   	Scanner scn=new Scanner(System.in);
		   	//   take the input  for  no of rows  and   column \
		   	int n=scn.nextInt();
		   	int m=scn.nextInt();
		   	
		   	
		   	int[][] arr =new int[n][m];
		   	for(int i=0;i<n;i++)
		   	{
		   		for(int j=0;j<m;j++)
		   		{
		   			arr[i][j]=scn.nextInt();
		   		}
		   	}
		//    we have taken  input  
		   	boolean[][]  visited  =new boolean[n][m];
		   	
		   	//  ca;  for  the   funcion    of the    floodd  fill   
		   floodfill(arr,0,0,"",visited);
		   
		

	}
	
  public  static void  floodfill(int[][] arr , int i ,int j ,String psf,boolean[][] visited  ) {
	  
	  
	  
	  
	  
	  //  using   levels  and option appprroah in  this   questions 
	  //  that  from a      particular   questions   what all  options we have the options we have     fromm  the    option  0,0   to  the end 
	  
	  
	  //  we have   here  make  the  call   stupid and we  will  make  base  case  smartly n 
	  //  #   top 
	  //  
	  //  we  have   made  all   calls stupid  and   then  we  will  call  samrtly 
	  //  samrt base   case 
	  // v  last me  anne ka   mln ha  sb log  false nad sb board  ke  andar hi ha   to  ham usee 
	  //    skip  kr sakret ha
	  if(i<0||j<0|| i==arr.length ||  j==arr[0].length ||  arr[i][j]==1)
	  {
		  return;
	  }
	  
	  if(i==arr.length-1||   j==arr[0].length-1)
	  {
		  
		  System.out.println(psf);
		  return;
	  }
	  
	  
	  
	  //  problem  with thiss  code is  that  here we havve  to      keet the cell  non  visited    becfrore   going into that 
	  visited[i][j]=true;
	  floodfill(arr, i-1, j, psf+"t",visited);
	  //  #  left
	  floodfill(arr, i, j-1, psf+"l",visited);
	  //  # down 
	  floodfill(arr, i+1, j, psf+"d",visited);
	  //   #   right 
	  floodfill(arr, i, j+1, psf+"r",visited);
	  visited[i][j]=false;
	  //  har  path  apna  apan  step  khud bna  lega 
	  
	  
	
}

}
