package Way_Up1;

import java.lang.invoke.StringConcatFactory;
import java.security.CodeSigner;
import java.util.ArrayList;
import java.util.Iterator;

import javax.sql.rowset.JoinRowSet;
import javax.swing.plaf.multi.MultiLookAndFeel;

public class Get_Kpc {

	public static void main(String[] args) {
	
		
		
		
		//  weh have been giveen a  nokia phone and we are  told to  generate keypad combination    from  these keys  
		//  we have   given   through   the some  number as the input  we have to   genetrate  some   combination  via  it 
	    //  this   i s the   examplre  of the cartisoan produvt and all  the    of the  numbers 
		
		//  in this wee  will use the  expectattiona and  fauth appproach 
		
		//  like   we will brake the problem iintp    porecus  that "573"   we will   5  ,   73 ke   combiantin ham log aeee aagemge 
		// tumhari zimmaedari hogi ki  hamee ussee 5 ke  sath  product krenge 
		
		String s="573";
		
		getKpc(s);

	}
	static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx",
             "yz"
            };      
	 
	
	public   static ArrayList<String> getKpc(String s) {
		
		
		
		
		if(s.length()==0)
		{
		//    we have made one  of the 
			ArrayList<String>  bres=new ArrayList<>();
			
		bres.add("");
		return;
			}
		char ch =s.charAt(0);///   now  we  hvae  taken out   the    5  fomr  the  codde  and then  we jhav to    giv 773    for the substring 
		
		String ros=s.substring(1);  // so in  s we have 73    number 
		
		//  now  we have to  give combination of the ros  and then   mate  with   the     ch '
		
		 
		ArrayList<String> aros=getKpc(ros);
		//  now   to  we have  to make new array list  that  will  contain answer with  the  five 
		
		ArrayList<String> mans=new ArrayList<>();
		
		//   now  we  to apply  the   loop  the number of times 
		//  so   har ek  bad loop  change  hoa jaeega
		
		String  codele=codes[ch-'0'];
//   now  we havr to apply  loop in  codes  array
	 for(int i=0;i<codele.length();i++)
	 {
		 //   aaros  se joh ans  hame mile ha   unko hamme usee  met krna ha 
		 //  uslke  sareee character ke sath 
		 
		 char  chcode =codele.charAt(i);
		 for(String  rz:aros)
		 {
			 mans.add(chcode+"rz");
			 
		 }
	 }
	 return mans;
		
	} 

}
