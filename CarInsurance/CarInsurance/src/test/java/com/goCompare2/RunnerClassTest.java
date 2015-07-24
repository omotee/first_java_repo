package com.goCompare2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Suite.class)
//@SuiteClasses(TestGoCompare.class)
//public class RunnerClass {
//
//}


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources"}
		)
public class RunnerClassTest{
	
}



