package unitTest.electricity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class TariffElectricityMeterTest {

    ElectricityMeter electricityMeter;

    TariffProvider tp;

    @Before
    public void setUp() {
        tp = Mockito.mock(TariffProvider.class);
        electricityMeter = new ElectricityMeter(tp);
        electricityMeter.setTariffOn(true);
        electricityMeter.setElectricityTariffStartHour(12);
        electricityMeter.setElectricityTariffEndHour(14);
    }

    @Test
    public void GivenOnTariffWhenKwhAdditionThenCounterTariffIsIncreased() {
        //Given
        Mockito.when(tp.isTariffNow()).thenReturn(true);
        //When
        electricityMeter.addKwh(100);
        //Then
        Assert.assertEquals(100, electricityMeter.getKwhTariff(), 0.01);
    }

    @Test
    public void GivenNotOnTariffWhenKwhAdditionThenCounterIsIncreased() {
        //Given
        Mockito.when(tp.isTariffNow()).thenReturn(false);
        //When
        electricityMeter.addKwh(100);
        //Then
        Assert.assertEquals(100, electricityMeter.getKwh(), 0.01);
    }

}
