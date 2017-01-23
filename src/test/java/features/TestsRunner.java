package features;

import org.jboss.arquillian.container.test.api.RunAsClient;

import org.junit.runner.RunWith;

import cucumber.runtime.arquillian.CukeSpace;
import cucumber.runtime.arquillian.api.Features;
import cucumber.runtime.arquillian.api.Glues;


@RunWith(CukeSpace.class)
@Features("src/test/java/feature/SearchAutoAompletion.feature")
@Glues(features.stepdefinitions.SearchAutoCompletion.class)
@RunAsClient
public class TestsRunner {
}
