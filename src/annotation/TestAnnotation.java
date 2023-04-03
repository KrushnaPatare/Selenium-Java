package annotation;

import org.testng.annotations.Test;

public class TestAnnotation {
     
	// If priority is not mentioned then @Test annotation will execute methods on 
	// the  base of alphabetical order of method name not on their writing order.
	 @Test
	    public void Test2() {
			System.out.println("Test2 executed.");
		}
	 
	@Test               
	public void Test1() {
		System.out.println("Test1 executed.");
	}

}
