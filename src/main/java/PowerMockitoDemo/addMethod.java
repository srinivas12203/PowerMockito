package PowerMockitoDemo;

import java.lang.reflect.Method;

public class addMethod {
	
	public static int add(int num1,int num2)
	{
		System.out.println("Powermockito");
		int sum=num1+num2;
		
		System.out.println(sum);
		return sum;
	
		
	}

	
	  private int multiply(int num1,int num2) { 
	  int mul=num1*num2;
	  System.out.println(mul);
	  return mul;
	  
	  }
	  public  int privateCall(int num1,int num2) {
		  
		  int mul= multiply(num1,num2);
		  return mul;
	  }
	 	
}
