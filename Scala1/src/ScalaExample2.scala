/**
  * Created by dbhattac on 11/18/2016.
  */
object ScalaExample2
{
  def main(args : Array[String]): Unit =
  {
    var i = 0

    val alist = List(1,2,3,4,5)
    for( i <- alist)
      {
        println(i)
      }
  }
}