package com.language.GeekTrust;

/**
 * Created by dbhattac on 5/24/2017.
 */
public class Fire  implements  IReigns,Kingdom{
    public Emblem emblem  = Emblem.Dragon;

    private Ruler ruler = null;
    public Fire(Ruler ruler)
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
