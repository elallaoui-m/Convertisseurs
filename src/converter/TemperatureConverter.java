/**
 * cette classe est responsable de la convertion des Temerature
 * elle contient 2 fonctions en mode privee permetantes de faire la conversion a partie et au Celsius
 *
 */
package converter;



public class TemperatureConverter {

    /**
     *
     * @param from
     * @param to
     * @param value
     * @return wanted_value
     */
    public static double convert(String from, String to, double value)
    {

        double tmp = toC(from,value);
        return fromC(to,tmp);

    }

    /**
     *
     * @param from
     * @param value
     * @return value_in_Celsius
     */
    private static double toC(String from,double value)
    {
        if (from.equals("Kelvin"))
            return value - 273.15;
        if (from.equals("Fahrenheit"))
            return (value - 32)*(5.0/9);
        return value;
    }

    /**
     *
     * @param to
     * @param value
     * @return value_from_Celsius
     */
    private static double fromC(String to,double value)
    {
        if (to.equals("Kelvin"))
            return  273.15 + value;
        if (to.equals("Fahrenheit"))
            return value*(9.0/5) + 32;
        return value;


    }
}
