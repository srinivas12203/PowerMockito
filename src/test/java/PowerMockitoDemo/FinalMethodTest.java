/**
 * 
 */
package PowerMockitoDemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @author C-PN19
 *
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({finalAddMethod.class})
public class FinalMethodTest {
	
	private finalAddMethod finalAdd;
	
	@Test
	public void finalTest() {
		finalAdd = PowerMockito.mock(finalAddMethod.class);
		final String testInput = "A test input";
        final String mockedResult = "Mocked final echo result - " + testInput;
        Mockito.when(finalAdd.finalMethod(testInput)).thenReturn(mockedResult);
        System.out.println(mockedResult);
        // Assert the mocked result is returned from method call
        Assert.assertEquals(finalAdd.finalMethod(testInput), mockedResult);
    
	}
	
	}


