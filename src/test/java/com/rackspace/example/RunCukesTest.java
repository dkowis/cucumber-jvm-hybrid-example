package com.rackspace.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:", glue = {"src/test/resources", "classpath:cucumber/examples/java/calculator"})
public class RunCukesTest {
}
