package com.gaurav.unleashmaven;
import org.testng.annotations.Test;
/**
 * Integration tests
 */
public class AppITCase {

	@Test
	public void checkTestAndCompilePhase()
	{
		System.out.println("Test phase automatically trigerring compile phase.");
	}
	
	@Test
	public void checkVerifyAndTestPhase()
	{
		System.out.println("Verify phase automatically trigerring test phase.");
	}
}
