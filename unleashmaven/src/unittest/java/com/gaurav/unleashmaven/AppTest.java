package com.gaurav.unleashmaven;
import org.testng.annotations.Test;                                       


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void checkCompilePhase()
	{
		System.out.println("checking compile phase");
	}
	
	@Test
	public void checkTestCompilePhase()
	{
		System.out.println("checking test-compile phase");
	}
	
	@Test
	public void checkVerifyPhase()
	{
		System.out.println("checking verify phase");
	}
}
