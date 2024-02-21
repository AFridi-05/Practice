package Com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)   // runwith is used when we have to run specific file

@CucumberOptions(features= {"src//test//resources//Form/Simple_Form.feature"},
glue={"Steps"}
)


//,plugin = {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml","json:testoutput/cucumberjason.xml"})   
//tags = "@tag1" 

public class FormRunner {

}