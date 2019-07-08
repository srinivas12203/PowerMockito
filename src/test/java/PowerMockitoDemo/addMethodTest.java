package PowerMockitoDemo;

import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;




@RunWith(PowerMockRunner.class)
@PrepareForTest({addMethod.class})
//@PrepareForTest({ClassWithStaticMethod.class})
public class addMethodTest {
	private addMethod addmethod;
	@Test
	public void testAddStaticMethod() {
		System.out.println("success");
		
		PowerMockito.mockStatic(addMethod.class);
		int num1=80;
		int num2=20;
		int expect=30;
		System.out.println("success2");
		
		PowerMockito.when(addMethod.add(num1,num2)).thenReturn(expect);
		int actual =addMethod.add(num1,num2);
		System.out.println(actual);
		System.out.println("success3");
    	Assert.assertEquals(expect, actual);
    	System.out.println(actual);
		System.out.println("success4");
	}
	
	/*
	 * @Test public void testClassWithStaticMethod_printMessage_staticMethod() {
	 * PowerMockito.mockStatic(ClassWithStaticMethod.class); String message =
	 * "Hello PowerMockito"; //1 String expectation = "Expectation"; //2
	 * 
	 * 
	 * PowerMockito.when(ClassWithStaticMethod.printMessage(message)).thenReturn(
	 * expectation); //4
	 * 
	 * String actual = ClassWithStaticMethod.printMessage(message); //5
	 * System.out.println(actual); Assert.assertEquals(expectation, actual); //6 }
	 */
	
	
	  
	
	
}
