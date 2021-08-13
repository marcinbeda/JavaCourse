package unitTest;

import unitTest.electricity.ExistElectricityMeterTest;
import unitTest.electricity.TwoElectricityMetersTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Marcin Beda.
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ExistElectricityMeterTest.class,
        ExistElectricityMeterTest.class,
        TwoElectricityMetersTest.class
})
public class ElectricityMeterSuite {
}
