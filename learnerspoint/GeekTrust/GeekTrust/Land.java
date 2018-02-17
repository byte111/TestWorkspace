package com.language.GeekTrust;

/**
 * Created by dbhattac on 5/24/2017.
 */
public class Land  implements  IReigns,Kingdom{
    public Emblem emblem  = Emblem.Panda;
    private Ruler ruler = null;
    public Land(Ruler ruler)
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
