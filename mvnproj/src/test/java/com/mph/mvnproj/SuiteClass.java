package com.mph.mvnproj;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class SuiteClass {
	@RunWith(Suite.class)
	@SuiteClasses({Calculate.class,AssetMethodsTest.class})
	public class AllTestClasses{
		
	}
}
