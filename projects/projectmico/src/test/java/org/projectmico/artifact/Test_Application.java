package org.projectmico.artifact;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Application {   
	@Test
	public void testApplication() {
		String hellomico = "Hi! I am mICO! ^_^";
		Assert.assertNotNull(hellomico);
		Assert.assertEquals(hellomico, "Hi! I am mICO! ^_^");

	}
}