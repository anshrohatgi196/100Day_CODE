package Way_Up1;

import java.lang.invoke.StringConcatFactory;

public class Get_Subsequence {

	public static void main(String[] args) {
	
		
		//  what is  use of substring --->  that it does not     take the  last  2 number or index encounterred 
		
		
		//    
		String s="abcd";
				System.out.println(s.substring(1,3));
  
				
				//   when  we do not give any parameter to the substring and  does give only first  index(1) --->  it will   print   till    the  end 
				
				
				
				String   a="xybz";
				System.out.println(a.substring(1));
				
			
				//   this  will apply   alll  the  commits and  wee will get al  the   substrings 
				for(int i=0;i<s.length();i++)
				{
					for(int j=i+1;j<=s.length();j++)
					{
						System.out.println(s.substring(i,j));
					}
				}
				
				
	}

	
	
	
	
	
}
