package annotation;

import org.testng.annotations.Test;

public class AnnotationKeywordInvocationCount {

	// invocationCount keyword causes method to run multiple times.
	 @Test (invocationCount = 3)
	    public void Test2() {
			System.out.println("Test2 executed.");
		}
	 
	 
	 @Test ()
	public void Test1() {
		System.out.println("Test1 executed.");
	}
}
