package PowerMockitoDemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({addMethod.class})
public class testPrivateMethod {
	private addMethod addmethod;
	@Test 
	  public void testPrivateMethod() throws Exception { 
		  addMethod spy1=PowerMockito.spy(new addMethod()); 
		  int num1=10; 
		  int num2=2;
		  int expect=30;
	
	
	  PowerMockito.when(spy1.privateCall(num1,num2)).thenReturn(expect);
	
	  int actual =spy1.privateCall(num1,num2); 
	//  int actual =addmethod.privateCall(num1,num2); 
	  System.out.println("actual value");
	  System.out.println(actual);
	  Assert.assertEquals(expect, actual);
	  
	
	}
	 
	

}
