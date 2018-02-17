package com.strings;

/**
 * Created by dbhattac on 1/1/2017.
 */
public class palindrome {

    public static void main(String args[])
    {

        if(args == null || args.length <=0)
        {
            System.exit(0);
        }
        String input = args[0];

        int len = input.length();

        if(len <=1)
        {
            System.out.println("1");
            System.out.println(input);
        }
        else
        {
            String newstring = input;
            int counts= 0 ;
            for(int i  = 0, j = len-1 ; i < j; i++ , j--)
            {
                if(input.charAt(i) != input.charAt(j))
                {
                    String firstpart =  newstring.substring(0,j)  ;
                    String lastpart = newstring.substring(j+1,len);
                    newstring = firstpart + input.charAt(i) + lastpart;
                    counts++;
                }
            }
            System.out.println(counts);
            System.out.println(newstring);

        }

    }
}
