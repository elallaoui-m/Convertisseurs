/**
 * cette classe est responsable de la convertion des masse
 * elle contient 2 fonctions en mode privee permetantes de faire la conversion a partie et au mg
 * comme ca on evite les test qui se fait sur les unites de conversion
 *
 * biensur on se basanr sur un hashMap contenant les facteurs de conversion pour le mg
 *
 * on a choisi la plus petite unite pour generaliser la multiplication et la division
 */

package converter;

import java.util.HashMap;


public class MasseConverter {

    private static HashMap<String, Double> ConvertionUnites;

    static
    {
        ConvertionUnites = new HashMap<String,Double>();
        ConvertionUnites.put("mg",1.0);
        ConvertionUnites.put("g",1000.0);
        ConvertionUnites.put("kg",1000000.0);
        ConvertionUnites.put("t",1000000000.0);
        ConvertionUnites.put("pound",453592.0);
        ConvertionUnites.put("ounce",28349.5);

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

        double tmp = toMg(from,value);
        return fromMg(to,tmp);

    }

    /**
     *
     * @param from
     * @param value
     * @return value_in_Mg
     */
    private static double toMg(String from,double value)
    {
        return value*ConvertionUnites.get(from);
    }

    /**
     *
     * @param to
     * @param value
     * @return value_from_mg
     */
    private static double fromMg(String to,double value)
    {
        return value/ConvertionUnites.get(to);
    }
}
