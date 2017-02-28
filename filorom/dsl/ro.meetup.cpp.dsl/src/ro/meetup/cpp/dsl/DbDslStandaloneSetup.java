
package ro.meetup.cpp.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DbDslStandaloneSetup extends DbDslStandaloneSetupGenerated{

	public static void doSetup() {
		new DbDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

