package tata.ope.basicas;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ OperacionesDividirTest.class, OperacionesMultiplicarTest.class, OperacionesRestarTest.class,
		OperacionesSumarTest.class })
public class AllTests {

}
