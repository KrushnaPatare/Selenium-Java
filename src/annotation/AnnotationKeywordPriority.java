package annotation;

import org.testng.annotations.Test;

public class AnnotationKeywordPriority {
     //if priority is not mentioned, default priority = 0.
	 @Test
	    public void Test2() {
			System.out.println("Test2 executed.");
		}
	 
	 //can give multiple keywords in bracket of @Test.
	 @Test ( priority = 1, invocationCount = 3)
	public void Test1() {
		System.out.println("Test1 executed.");
	}
	
	 //priority can be negative.
	 @Test (priority = -1)
		public void Test3() {
			System.out.println("Test3 executed.");
		}
	
   
}
