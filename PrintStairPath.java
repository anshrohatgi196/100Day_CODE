
public class PrintStairPath {

	public static void main(String[] args) {
		int  n =7;
		  printStairPaths(n, "");
		
	}
	 public static void printStairPaths(int n, String psf) {
		 
		 
		 //   to  avoid  the storage  problem wen have  cchoosen the level and options approach 
		 
		 
		 
		 if(n<0)
		 {
			 return;
		 }
		 
		 if(n==0)
		 {
			 
			 
			 System.out.println(psf);
			 return;
		 }
		    printStairPaths(n - 1, psf + 1);
	        printStairPaths(n - 2, psf + 2);
	        printStairPaths(n - 3, psf + 3);
	    }

}
