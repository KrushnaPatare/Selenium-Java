package annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleAnnotation {

	@Test   //if not mentioned then @Test annotation only run one time.             
	public void Test1() {
		System.out.println("Test1 executed.");
	}
	
    @Test
    public void Test2() {
		System.out.println("Test2 executed.");
	}
	
    @BeforeMethod   //runs before every method present in class.
    public void beforeMethod() {
    	System.out.println("BeforeMethod Executed.");
    }
    
    @AfterMethod    //runs After every method present in class.
    public void fterMethod(){
    	System.out.println("AfterMethod Executed.");
    }
    
    @BeforeClass //runs only one time at starting of class.
    public void beforeClass() {
    	System.out.println("BeforeClass Exeuted.");	
    }
    
    @AfterClass  //runs only one time at ending of class.
    public void afterClass() {
    	System.out.println("AfterClass Exeuted.");	
    }
    
    @BeforeTest //runs only one time before class execution starts.
    public void beforeTest() {
    	System.out.println("BeforeTest Executed.");
    }
    
    @AfterTest  //runs only one time after class execution starts.
    public void afterTest() {
    	System.out.println("AfterTest Executed.");
    }
    
}
