package annotation;

import org.testng.annotations.Test;

public class AnnotationKeywordEnabled_False {
	 @Test
	    public void Test2() {
			System.out.println("Test2 executed.");
		}
	 
	 //enabled=false this annotation skip the method within it.
	 @Test (enabled=false)
	public void Test1() {
		System.out.println("Test1 executed.");
	}
}
