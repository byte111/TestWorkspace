package com.language.GeekTrust;

/**
 * Created by dbhattac on 5/24/2017.
 */
public class Water  implements  IReigns,Kingdom{
    public Emblem emblem  = Emblem.Octopus;
    private Ruler ruler = null;
    public Water(Ruler ruler)
    {
        this.ruler = ruler;
    }

    @Override
    public void setRuler(Ruler ruler) {
        this.ruler = ruler;
    }

    @Override
    public Ruler getRuler() {
        return ruler;
    }
    public String toString()
    {
        return this.getClass().getSimpleName();
    }
}
