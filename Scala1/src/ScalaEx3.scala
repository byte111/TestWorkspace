/**
  * Created by dbhattac on 11/18/2016.
  *
  * Method call example
  */
object ScalaEx3
{
  def main(args: Array[String]): Unit =
  {
    def sum(num1 : Int =1  , num2 : Int =2 ) : Int =
    {
        return num1 + num2
    }

      println (" 4 + 5 = " + sum(4,5));

  }


}