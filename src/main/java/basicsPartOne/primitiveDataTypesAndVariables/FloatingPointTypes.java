package basicsPartOne.primitiveDataTypesAndVariables;

import java.math.BigDecimal;

/**
 * Created by Marcin Beda.
 */

public class FloatingPointTypes {

    float   f1 = 1.4E-45F, f2 = 3.4E+38F;   // rozmiar 32 bitów (4 bajty)
    double  d1 = 4.9E-324, d2 = 1.79E+308;  // rozmiar 64 bitów (8 bajtów)

    // 2E+2 == 2 * 10^2.
    // 2E-5 == 2 * 10^(1/5).

    // Gdy wymagana jest przeogromna precyzja korzystajmy z klasy BigDecimal.
    BigDecimal bigDecimal = new BigDecimal(10);
}
