package annotation;

import org.testng.annotations.Test;

public class AnnotationKeywordTimeOut {

	//timeout keyword restricts execution time for method, if it fails to execute
	//in within that time then method is marked as failed in console/output.
	
	@Test (timeOut=1000)
    public void Test2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test2 executed.");
	}
 
 
    @Test ()
    public void Test1() {
	System.out.println("Test1 executed.");
}
}
