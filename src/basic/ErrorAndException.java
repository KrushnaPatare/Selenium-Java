package basic;

public class ErrorAndException {

	public static void main(String[] args) {
		
	int a=10;
		
	int	b=0;
	
//                        *Error*
//	System.out.printLN();  --- coding mistake that did not allow the compilation programme
	
	System.out.println("Hello");
	
//                        *Exception*		
	
	                       
//	                     *Unchecked Exception*
//	System.out.println(a/b);  //--- execution is stopped after this code.
	
//	                    *Checked exception*
//  when we know exception will occur then we use some keywords to avoid it.
//	eg. try, catch.
    
//	try
//	{
//		System.out.println(a/b);
//	}
//	
//	catch(Exception A)
//	{
//		System.out.println("Invalid exception.");
//	}

	
//                        *finally keyword
//  finally keyword is used to execute code even an exception is there but 
//  further code after finally block will not run if there is an exception is already occurred.
	
//	try
//	{
//		System.out.println(a/b);
//	}
//	
//	finally 
//	{
//		System.out.println("I want run this code anyway.");
//	}
//	
//	System.out.println("Thank you!");
	
	

//	try
//	{
//		System.out.println(a+b);
//	}
//	
//	finally 
//	{
//		System.out.println("I want run this code anyway.");
//	}
	
	
	
	
	try
	{
		System.out.println(a+b);
	}
	
	catch(ArithmeticException E)
    {
		System.out.println("Invalid exception.");
	}
	
	
	
	
	
	}

}
