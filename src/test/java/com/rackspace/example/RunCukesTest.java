package com.rackspace.example;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "classpath:", glue = {"src/test/resources", "classpath:cucumber/examples/java/calculator"})
public class RunCukesTest {
}
