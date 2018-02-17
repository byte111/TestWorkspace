package com.language.GeekTrust;

/**
 * Created by dbhattac on 5/24/2017.
 */
public class Space  implements  IReigns ,Kingdom{

    private Ruler ruler = null;
    public Space(Ruler ruler)
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
