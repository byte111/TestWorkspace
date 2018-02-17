package com.language.GeekTrust;

import java.util.List;
import java.util.Scanner;

/**
 * Created by dbhattac on 5/24/2017.
 */
public class Driver {

    public static void main(String args[])
    {
        try {
            Ruler ruler = new Ruler();
            ruler.setRuler("Shan");
            Universe universe = new Universe(ruler);
            Kingdom destination = null;
            String message = null;

            Scanner scanner = new Scanner(System.in);

            System.out.println(" ================================================");
            System.out.println(" 1.   Who is the ruler of Southeros? ");
            System.out.println(" 2.   Allies of King Shan? ");
            System.out.println(" 3.   Messages to kingdoms from King Shan: ");
            System.out.println(" 4.   Exit ");
            System.out.println(" ================================================");
            String input = scanner.nextLine();

            while (!"4".equals(input))
            {

                if ("1".equals(input)) {
                    Ruler univ = universe.ruler;

                    System.out.println(univ == null ? "None" : univ.getRuler());
                } else if ("2".equals(input)) {
                    List allies = universe.allies.get(ruler);

                    System.out.println(((allies == null) || (allies.size() == 0)) ? "None" : allies.toString());
                } else if ("3".equals(input)) {
                    String messagetokingdom = scanner.nextLine();

                    String dest = messagetokingdom.substring(0, messagetokingdom.indexOf(","));
                    destination = universe.getKingdom(dest);

                    universe.sendMessage(ruler, destination, messagetokingdom.substring(messagetokingdom.indexOf(",")+1).toUpperCase());

                }

                input = scanner.nextLine();

            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
