/**
 * cette classe est responsable de la convertion des distance
 * elle contient 2 fonctions en mode privee permetantes de faire la conversion a partie et au mm
 * comme ca on evite les test qui se fait sur les unites de conversion
 *
 * biensur on se basanr sur un hashMap contenant les facteurs de conversion pour le mm
 *
 * on a choisi la plus petite unite pour generaliser la multiplication et la division
 */
package converter;

import java.util.HashMap;

public class DistanceConverter {

    private static HashMap<String, Double> ConvertionUnites;

    static
    {
        ConvertionUnites = new HashMap<String,Double>();
        ConvertionUnites.put("mm",1.0);
        ConvertionUnites.put("cm",10.0);
        ConvertionUnites.put("dm",100.0);
        ConvertionUnites.put("m",1000.0);
        ConvertionUnites.put("dam",100000.0);
        ConvertionUnites.put("km",1000000.0);
        ConvertionUnites.put("Inch",25.4);
        ConvertionUnites.put("Foot",304.8);
        ConvertionUnites.put("Mile",1.609e+6);
    }

    /**
     *
     * @param from
     * @param to
     * @param value
     * @return wanted_value
     */
    public static double convert(String from, String to, double value)
    {

        double tmp = toMm(from,value);
        return fromMm(to,tmp);

    }

    /**
     *
     * @param from
     * @param value
     * @return value_in_mm
     */
    private static double toMm(String from,double value)
    {
        return value*ConvertionUnites.get(from);
    }

    /**
     *
     * @param to
     * @param value
     * @return value_from_mm
     */
    private static double fromMm(String to,double value)
    {
        return value/ConvertionUnites.get(to);
    }
}
