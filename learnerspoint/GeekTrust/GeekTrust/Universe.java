package com.language.GeekTrust;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dbhattac on 5/24/2017.
 */
public class Universe {

    Air kingdomAir;
    Fire kingdomFire;
    Ice kingdomIce;
    Land kingdomLand;
    Space kingdomSpace;
    Water kingdomWater;
    Ruler ruler;
    HashMap<Ruler,List<Kingdom>> allies = new HashMap();
    public   Universe(Ruler ruler)
    {
        kingdomAir = new Air(null);
        kingdomFire = new Fire(null);
        kingdomIce = new Ice(null);
        kingdomLand = new Land(null);
        kingdomSpace = new Space(ruler);
        kingdomWater  = new Water(null);

    }

    public Kingdom getKingdom(String kingdom)
    {
        if("Air".equalsIgnoreCase(kingdom))
            return kingdomAir;
        else if("Water".equalsIgnoreCase(kingdom))
            return kingdomWater;
        else if("Fire".equalsIgnoreCase(kingdom))
            return kingdomFire;
        else if("Ice".equalsIgnoreCase(kingdom))
            return kingdomIce;
        else if("Land".equalsIgnoreCase(kingdom))
            return kingdomLand;
        else if("Space".equalsIgnoreCase(kingdom))
            return kingdomSpace;
        else
            return null;
    }

    public void sendMessage(Ruler ruler , Kingdom destination,String message)
    {
         if(destination instanceof Air) {
             if(decodeMessage(message,kingdomAir.emblem)) {
                 kingdomAir.setRuler(ruler);

                 updateAllies(ruler, destination);
             }
         }
        else if(destination instanceof Fire) {
         if(decodeMessage( message, kingdomFire.emblem)) {
             kingdomFire.setRuler(ruler);

             updateAllies(ruler, destination);
         }
     }
        else if(destination instanceof  Ice) {
              if(decodeMessage( message, kingdomIce.emblem))
              {      kingdomIce.setRuler(ruler);

             updateAllies(ruler,destination);}
     }
        else if(destination instanceof Land) {
              if(decodeMessage( message, kingdomLand.emblem))
              { kingdomLand.setRuler(ruler);

             updateAllies(ruler,destination);}
     }
        else if(destination instanceof Water) {
         if(decodeMessage( message, kingdomWater.emblem))
         {   kingdomWater.setRuler(ruler);

             updateAllies(ruler,destination);}
     }

    }

    private void updateAllies(Ruler ruler ,Kingdom destination)
    {
        List<Kingdom> temp = allies.get(ruler);
        if(temp == null)
            temp = new ArrayList<Kingdom>();
        temp.add(destination);
        allies.put(ruler,temp);

        for(Ruler rul : allies.keySet())
        {
            if((allies.get(rul).size() > 2))
            {
                this.ruler = rul;
                break;
            }
        }
    }

    private boolean decodeMessage( String message,Emblem emblem)
    {
        if(message == null || message.length() == 0) return false;
        if(message.length() >= Emblem.getStringValue(emblem).length())
        {
            int ascii[] = new int[127];
            Arrays.fill(ascii,0);
            for(char c: Emblem.getStringValue(emblem).toCharArray())
            {
                ascii[(int)c] +=1;
            }

            for(char c:message.toCharArray())
            {
                int index = (int)c;

                if(index > 127) continue;

                if(ascii[index] >0)
                    ascii[index]-- ;
            }

            for(int i: ascii)
            {
                if(i >0)
                    return false;
            }

            return true;
        }
        else
            return false;
    }




    private boolean decodeMessage2( String message,Emblem emblem)
    {
        if(message == null || message.length() == 0) return false;
        if(message.length() >= Emblem.getStringValue(emblem).length())
        {
            int ascii[] = new int[127];
            Arrays.fill(ascii,0);
            for(char c: Emblem.getStringValue(emblem).toCharArray())
            {
                ascii[(int)c] +=1;
            }

            for(char c:message.toCharArray())
            {
                if(ascii[(int)c] >0)
                    ascii[(int)c]-- ;
            }

            for(int i: ascii)
            {
                if(i >0)
                    return false;
            }

            return true;
        }
        else
            return false;
    }

    public static void main(String args[])
    {
        Universe obj = new Universe(null);
      // System.out.print( obj.decodeMessage("Summer is coming".toUpperCase(),Emblem.Octopus));
        System.out.print(obj.getClass().getSimpleName());
    }

}

