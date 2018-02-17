/**
  * Created by dbhattac on 11/18/2016.
  */
object ScalaFactorial
{
  def main(args : Array[String]) : Unit =
  {
    def factorial( num : BigInt ) : BigInt =
    {
      if(num <= 1)
        {
          return num
        }

      else
        {
          num * factorial(num -1)
        }
    }

    println (" Factorial of 4  = " + factorial (4));
  }
}
