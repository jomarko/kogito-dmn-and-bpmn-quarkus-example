package scesim.kogito;

import org.kogito.scenariosimulation.runner.KogitoJunitActivator;

/**
 * KogitoJunitActivator is a custom JUnit runner that enables the execution of Test Scenario files (*.scesim).
 * This activator class, when executed, will load all scesim files available in the project and run them.
 * Each row of the scenario will generate a test JUnit result.
 */
@org.junit.runner.RunWith(KogitoJunitActivator.class)
public class KogitoScenarioJunitActivatorTest {

}
