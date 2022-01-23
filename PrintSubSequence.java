import javax.naming.ldap.StartTlsRequest;

public class PrintSubSequence {

	public static void main(String[] args) {
	String  ss  ="abc";
	
	
	
	PrintSS(ss,"");

	}

	
	
	
	public static  void  PrintSS(String q , String a)
	{
		///  we  will not    taket the  result in the  array list 
		
		
		if(q.length()==0)
		{
			System.out.println(a);
			return;
		}
		
		char ch=q.charAt(0);
		String roq =q.substring(1);
		
		//   type  of yes or no
		PrintSS(roq, a+"ch");
		PrintSS(roq,a+"");
	}
}
