package basicsPartTwo.conversionAndCasting;

/**
 * Created by Marcin Beda.
 */

public class ConversionAndCasting {

    public static void main(String[] args) {
	    /* Rzutowanie niejawne */
        short zmShort = 125;
        int zmInt;
        zmInt = (int)zmShort;
        System.out.println(zmInt);

        /* Rzutowanie jawne */
        float zmFloat = 3.0F;
        long zmLong;
        zmLong = (long)zmFloat;
        short zmShort2 = (short)zmLong;
        System.out.println(zmLong);

        /* Liczbowe > String */
        String text = String.valueOf(zmInt);
        text = Long.toString(zmLong);
        System.out.println(text);

        /* String > Liczbowe */
        String text2 = "123.5";
        float zmFloat2 = Float.parseFloat(text2);
        System.out.println(zmFloat2 + 100);
        System.out.println(text2 + 100 + "tekst");
    }
}
