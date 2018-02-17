package com.language.GeekTrust;

/**
 * Created by dbhattac on 5/24/2017.
 */
enum Emblem {
    Panda,Octopus,Mammoth,Owl,Dragon;
    public static String getStringValue(Emblem emblem)
    {
        switch (emblem)
        {
            case Panda:
                        return "PANDA";
            case Octopus:
                        return "OCTOPUS" ;
            case Mammoth:
                        return "MAMMOTH" ;
            case Owl:
                        return "OWL" ;
            case Dragon:
                        return "DRAGON" ;
            default: return null;
        }

    }
}
