/**
 * classe contenante des arraylist static qui contiennent les unites de chaque mesures;
 *
 * la classe dispose d'un block static pour l'inistialisation des memebres statiques
 */



package converter;

import java.util.ArrayList;


public class Unites {
    public static ArrayList<String> DISTANCE  ;
    public static ArrayList<String> MASSE ;
    public static ArrayList<String> TEMPERATURE ;
    public static String[] Mesures = {"--Select--","Distance","Masse","Temperature"};

    static
    {
        //Distance
        DISTANCE = new ArrayList<>();
        //DISTANCE.add("mm");
        DISTANCE.add("cm");
        DISTANCE.add("dm");
        DISTANCE.add("m");
        DISTANCE.add("dam");
        DISTANCE.add("hm");
        DISTANCE.add("km");
        DISTANCE.add("Inch");
        DISTANCE.add("Foot");
        DISTANCE.add("Mile");

        //Masse
        MASSE = new ArrayList<>();
        //MASSE.add("mg");
        MASSE.add("g");
        MASSE.add("kg");
        MASSE.add("t");
        MASSE.add("pound");
        MASSE.add("ounce");

        //TEMPERATURE
        TEMPERATURE =  new ArrayList<>();
        TEMPERATURE.add("Celsius");
        TEMPERATURE.add("Fahrenheit");
        TEMPERATURE.add("Kelvin");

    }
}
