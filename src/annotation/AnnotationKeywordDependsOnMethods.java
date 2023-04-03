package annotation;

import org.testng.annotations.Test;

public class AnnotationKeywordDependsOnMethods {
	

	@Test (timeOut=1000)
    public void Test2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test2 executed.");
	}
 
    @Test
    public void Test1() {
	System.out.println("Test1 executed.");
    }
    
	@Test(dependsOnMethods= {"Test2"})
	public void Test3() {
		System.out.println("Test3 Executed.");
	}
	
}
