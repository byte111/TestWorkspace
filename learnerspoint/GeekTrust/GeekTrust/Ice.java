package com.language.GeekTrust;

/**
 * Created by dbhattac on 5/24/2017.
 */
public class Ice  implements  IReigns,Kingdom{
    public Emblem emblem  = Emblem.Mammoth;

    private Ruler ruler = null;
    public Ice(Ruler ruler)
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
