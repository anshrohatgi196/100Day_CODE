import javax.xml.namespace.QName;

public class PrintKpc {

	public static void main(String[] args) {
		
		
		String ss="678";
		
		
		printKPC(ss, "");

	}
	
	
	
	static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx",
            "yz"
           };  
	
	
	
public static void printKPC(String str, String a) 



{
        
	
	char   ch =str.charAt(0);
	String  roq=str.substring(1);
	
	
	
	
	//   now   we have  to take  out  the  codes  ki lenght 
	
	String  codesl =codes[ch];
	
	
	
	for(int i=0;i<codesl.length();i++)
	{
		char op =codesl.charAt(i);
		
		printKPC(roq, a+op);
	
	}
	
	
	
	
	
	
	
	
	
    }

}
