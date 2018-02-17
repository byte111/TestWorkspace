package com.language.GeekTrust;

import java.util.Arrays;

/**
 * Created by dbhattac on 5/24/2017.
 */
public class Air implements  IReigns,Kingdom{
    public Emblem emblem  = Emblem.Owl;
    private Ruler ruler = null;

    public Air(Ruler ruler)
    {
        this.ruler = ruler;
    }
    @Override
    public void setRuler(Ruler ruler)
    {
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
