/**
 * Created by dbhattac on 12/4/2016.
 */
public class test1 {
    public void a()
    {

        Integer i = new Integer(1);
        System.out.println(" i in a before   = " + i);
        b(i);
        System.out.println(" i in a after    = " + i);
    }

    public void b(Integer i )
    {
        i  = 5;

        System.out.println(" i in b  = " + i);

    }

    public  static void main(String args[])
    {
        test1 t= new test1();
        t.a();

    }


}
